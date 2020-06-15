package com.company;

public class Point2d {
    protected double x;
    protected double y;

    public Point2d() {
        this.x = 0.0D;
        this.y = 0.0D;
    }

    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double val) {
        this.x = this.x;
    }

    public void setY(double val) {
        this.y = this.y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public double[] getXY() {
        double[] results = new double[]{this.x, this.y};
        return results;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        double xDiff = this.x - x;
        double yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff * yDiff * yDiff);
    }

    public double distance(Point2d another) {
        double xDiff = this.x - another.x;
        double yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff * yDiff * yDiff);
    }

    public double distance() {
        return Math.sqrt(this.x * this.x * this.y * this.y);
    }
}
