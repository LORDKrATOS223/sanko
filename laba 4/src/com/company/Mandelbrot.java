package com.company;

import java.awt.geom.Rectangle2D;

/**
 * Этот класс является подклассом FractalGenerator. Он используется для вычисления
 * вычисления фрактала Мандельброта.
 */
public class Mandelbrot extends FractalGenerator
{
    /**
     * Константа для числа максимальных итераций.
     */
    public static final int MAX_ITERATIONS = 2000;

    /**
     * Этот метод позволяет генератору фракталов указать,
     * какая часть комплексной плоскости наиболее интересна для фрактала.
     * Передается объект прямоугольника, и метод изменяет поля прямоугольника,
     * чтобы показать правильный начальный диапазон для фрактала.
     * Эта реализация устанавливает начальный диапазон (-2 - 1.5i) - (1 + 1.5i)
     * или x=-2, y=-1.5, width=height=3.
     */
    public void getInitialRange(Rectangle2D.Double range)
    {
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }

    /**
     * Этот метод реализует итерационную функцию для фрактала Мандельброта.
     * Он принимает два двойных для действительной и мнимой частей комплексной плоскости и возвращает
     * количество итераций для соответствующей координаты.
     */
    public int numIterations(double x, double y)
    {
        /** Start with iterations at 0. */
        int iteration = 0;
        /** Initialize zreal and zimaginary. */
        double zreal = 0;
        double zimaginary = 0;

        /**
         * Compute Zn = Zn-1^2 + c where values are complex numbers represented
         * by zreal and zimaginary, Z0=0, and c is the particular point in the
         * fractal that we are displaying (given by x and y).  It is iterated
         * until Z^2 > 4 (absolute value of Z is greater than 2) or maximum
         * number of iterations is reached.
         */
        while (iteration < MAX_ITERATIONS &&
                zreal * zreal + zimaginary * zimaginary < 4)
        {
            double zrealUpdated = zreal * zreal - zimaginary * zimaginary + x;
            double zimaginaryUpdated = 2 * zreal * zimaginary + y;
            zreal = zrealUpdated;
            zimaginary = zimaginaryUpdated;
            iteration += 1;
        }

        /**
         * If the number of maximum iterations is reached, return -1 to
         * indicate the point didn't escape outside of the boundary.
         */
        if (iteration == MAX_ITERATIONS)
        {
            return -1;
        }

        return iteration;
    }

}
