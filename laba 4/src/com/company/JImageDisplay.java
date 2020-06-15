package com.company;

import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

/**
 * Этот класс отображает фракталы
 * с помощью javax.swing.JComponent.
 */
class JImageDisplay extends JComponent
{
    /**
     * Экземпляр буферизованного изображения.
     * Управляет изображением, содержимое которого мы можем записать.
     */
    private BufferedImage displayImage;

    /**
     * Конструктор принимает целочисленную ширину и высоту и
     * инициализирует свой объект BufferedImage новым
     * изображением с этой шириной высотой типа изображения TYPE_INT_RGB.
     */
    public JImageDisplay(int width, int height) {
        displayImage = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);

        /**
         * Вызов метода setPreferredSize() родительского класса с заданной шириной и высотой.
         */
        Dimension imageDimension = new Dimension(width, height);
        super.setPreferredSize(imageDimension);

    }
    /**
     * Реализация суперкласса paintComponent(g).
     */
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(displayImage, 0, 0, displayImage.getWidth(),
                displayImage.getHeight(), null);
    }
    /**
     * Устанавливает все пиксели в изображении на черный.
     */
    public void clearImage()
    {
        int[] blankArray = new int[getWidth() * getHeight()];
        displayImage.setRGB(0, 0, getWidth(), getHeight(), blankArray, 0, 1);
    }
    /**
     * Устанавливает пиксель в определенный цвет.
     */
    public void drawPixel(int x, int y, int rgbColor)
    {
        displayImage.setRGB(x, y, rgbColor);
    }
}
