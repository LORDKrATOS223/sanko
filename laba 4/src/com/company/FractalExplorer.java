package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.Rectangle2D;
import java.awt.event.*;

/**
 * Этот класс позволяет исследовать различные части фрактала,
 * создавая и отображая графический интерфейс Swing, и
 * обрабатывает события, вызванные различными взаимодействиями с пользователем.
 */
public class FractalExplorer
{
    /** Целочисленный размер экрана является ширина и высота в пиксеях. **/
    private int displaySize;

    /**
     * Ссылка JImageDisplay для обновления отображения из различных методов при
     * вычислении фрактала.
     */
    private JImageDisplay display;

    /**
     * Объект FractalGnerator, использующий ссылку на базовый класс для отображения
     * других типов фракталов в будущем.
     */
    private FractalGenerator fractal;

    /**
     * Объект Rectangle2D.Double, который определяет диапазон
     * комплекса, который мы в данный момент отображаем.
     */
    private Rectangle2D.Double range;

    /**
     * Конструктор, который принимает размер экрана, сохраняет его и
     * инициализирует объекты диапазона и фрактального генератора.
     */
    public FractalExplorer(int size) {
        /** Хранит размер экрана **/
        displaySize = size;

        /** Устанавливает fractal-generator диапазон объекта. **/
        fractal = new Mandelbrot();
        range = new Rectangle2D.Double();
        fractal.getInitialRange(range);
        display = new JImageDisplay(displaySize, displaySize);

    }
    /**
     * Этот метод инициализирует Swing GUI с помощью JFrame,
     * содержащего объект JImageDisplay и кнопку для сброса отображения.
     */
    public void createAndShowGUI()
    {
        /** Установите фрейм, чтобы использовать java.awt.BorderLayout для его содержимого. **/
        display.setLayout(new BorderLayout());
        JFrame myframe = new JFrame("Fractal Explorer");

        /**
         * Добавляет картинку объекта в позицию BorderLayout.CENTER
         */
        myframe.add(display, BorderLayout.CENTER);

        /** Создает кнопку сброса. */
        JButton resetButton = new JButton("Reset Display");

        /** Экземпляр ResetHandler на кнопку сброса. */
        ResetHandler handler = new ResetHandler();
        resetButton.addActionListener(handler);

        /** Добавляет кнопку сброса в положение BorderLayout.SOUTH. */
        myframe.add(resetButton, BorderLayout.SOUTH);

        /**
         62/5000
         Экземпляр MouseHandler на компоненте фрактального дисплея. */
        MouseHandler click = new MouseHandler();
        display.addMouseListener(click);

        /** Ставит для операции закрытия кадра по умолчанию значение «выход». */
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * Раскладывает содержимое фрейма, делает его видимым
         * и запрещает изменение размера окна.
         */
        myframe.pack();
        myframe.setVisible(true);
        myframe.setResizable(false);
    }

    /**
     * Частный вспомогательный метод для отображения фрактала.  Этот метод просматривает
     * каждый пиксель на экране и вычисляет количество итераций для соответствующих координат в области отображения фрактала.
     * для соответствующих координат в области отображения фрактала.
     * Если число итераций равно -1, установливает цвет пикселя в черный.
     * В противном случае выбирает значение на основе количества итераций.
     * Обновляет изображение с цветом для каждого пикселя и перерисовывет
     * JImageDisplay когда все пиксели нарисованы.
     */
    private void drawFractal()
    {
        /** Проходит через каждый пиксель на дисплее */
        for (int x=0; x<displaySize; x++){
            for (int y=0; y<displaySize; y++){

                /**
                 * Находит координаты xCoord и yCoord
                 * в области отображения фрактала
                 */
                double xCoord = fractal.getCoord(range.x,
                        range.x + range.width, displaySize, x);
                double yCoord = fractal.getCoord(range.y,
                        range.y + range.height, displaySize, y);

                /**
                 * Вычисляет количество итераций в области отображени фрактала.
                 */
                int iteration = fractal.numIterations(xCoord, yCoord);

                /** Если количество итераций -1 - красит пиксель в черный. */
                if (iteration == -1){
                    display.drawPixel(x, y, 0);
                }

                else {
                    /**
                     * В противном случае выбирает значение оттенка в зависимости от количества итераций.
                     */
                    float hue = 0.7f + (float) iteration / 200f;
                    int rgbColor = Color.HSBtoRGB(hue, 1f, 1f);

                    /** Обновляет картинку с цветом для каждого пикселя. */
                    display.drawPixel(x, y, rgbColor);
                }

            }
        }
        /**
         * Когда все пиксели нарисованы, перекрашивает JImageDisplay в соответствии
         * с текущим содержимим его изображения.
         */
        display.repaint();
    }
    /**
     * Внутренний класс для обработки событий ActionListener от кнопки сброса.
     */
    private class ResetHandler implements ActionListener
    {
        /**
         * Обработчик сбрасывает диапазон в начальный диапазон,
         * заданный генератором, а затем рисует фрактал.
         */
        public void actionPerformed(ActionEvent e)
        {
            fractal.getInitialRange(range);
            drawFractal();
        }
    }
    /**
     * Внутренний класс для обработки событий MouseListener с дисплея.
     */
    private class MouseHandler extends MouseAdapter
    {
        /**
         * Когда обработчик получает событие щелчка мыши, он отображает
         * пиксельные координаты щелчка в отображаемой области фрактала,
         * а затем вызывает метод recenterAndZoomRange ()
         * генератора с координатами, по которым щелкнули, и масштабом 0,5.
         */
        @Override
        public void mouseClicked(MouseEvent e)
        {
            /** Получить координату х области отображения щелчка мыши. */
            int x = e.getX();
            double xCoord = fractal.getCoord(range.x,
                    range.x + range.width, displaySize, x);

            /** Получить координату y области отображения щелчка мыши. */
            int y = e.getY();
            double yCoord = fractal.getCoord(range.y,
                    range.y + range.height, displaySize, y);

            /**
             * Вызывает метод recenterAndZoomRange () генератора с координатами,
             * по которым щелкнули, и масштабом 0,5.
             */
            fractal.recenterAndZoomRange(range, xCoord, yCoord, 0.5);

            /**
             * Перерисовывает фрактал после изменения отображаемой области.
             */
            drawFractal();
        }
    }

    /**
     * Статический метод main () для запуска FractalExplorer. Инициализирует новый экземпляр
     * FractalExplorer с размером дисплея 600, вызывает
     * createAndShowGUI() для объекта проводника, а затем вызывает
     * drawFractal() для проводника, чтобы увидеть начальный вид.
     */
    public static void main(String[] args)
    {
        FractalExplorer displayExplorer = new FractalExplorer(600);
        displayExplorer.createAndShowGUI();
        displayExplorer.drawFractal();
    }
}
