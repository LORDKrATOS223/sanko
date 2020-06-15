package com.company;

import java.util.Objects;

public class Location
{
    /** Координаты по X. **/
    public int xCoord;

    /** Координаты по Y. **/
    public int yCoord;


    /** Создание нового местоположения с указанными целочисленными координатами. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Создание местоположения с координатами (0,0). **/
    public Location()
    {
        this(0, 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoord,yCoord);
    }

    @Override
    public boolean equals(Object coord) {
        Location lock = (Location) coord;
    if (this.xCoord == lock.xCoord && this.yCoord == lock.yCoord) return true;
    return false;
    }
}
