package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static double inputX() {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        return num;
    }
    public static double inputY() {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        return num;
    }
    public static double inputZ() {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        return num;
    }

    public static void main(String[] args) {

        System.out.println("Input points x, y, z: ");

        Point3d p1 = new Point3d(inputX(), inputY(), inputZ());
        System.out.println("Точка 1: " + p1);

        Point3d p2 = new Point3d(inputX(), inputY(), inputZ());
        System.out.println("Точка 2: " + p2);

        Point3d p3 = new Point3d(inputX(), inputY(), inputZ());
        System.out.println("Точка 3: " + p3);

        System.out.println("Переприсвоение " + p3);

        System.out.println("Расстояние расстояние от точки 1 до точки 2: " + p1.distance(p2));
        System.out.println("Расстояние расстояние от точки 1 до точки 3: " + p1.distance(p3));
        System.out.println("Расстояние: " + p1.distance());

        if (p1.getX() == p2.getX() && p1.getY() == p2.getY() && p1.getZ() == p2.getZ() ||
                p1.getX() == p3.getX() && p1.getY() == p3.getY() && p1.getZ() == p3.getZ() ||
                p2.getX() == p3.getX() && p2.getY() == p3.getY() && p2.getZ() == p3.getZ())
        {
            System.out.println("Координаты совпадают!");
        }
        else {
            Point3d.Square(p1, p2, p3);
        }
    }

}
