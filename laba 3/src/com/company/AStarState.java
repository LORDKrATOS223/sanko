package com.company;

import java.util.HashMap;

/**
 * Класс хранит базовое состояние необходимое для алгоритма А*, чтобы вычислить
 * путь по карте. Это состояние включает коллекции "открытых точек" и другие коллеции
 * "закрытых точек". Также этот класс обеспечивает основные операци А* алгоритма,
 * для обработки алгоритма.
 */

public class AStarState
{
    /** Это ссылка на карту, по которой работает алгоритм А*. **/
    private Map2D map;
    public HashMap <Location, Waypoint> Opened = new HashMap <Location, Waypoint>();
    public HashMap <Location, Waypoint> Closed = new HashMap <Location, Waypoint>();

    /**
     * Создание нового объекта для алгоритма поиска А*.
     **/
    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
    }

    /** Возвращает карту, по которой работает алгоритм А*. **/
    public Map2D getMap()
    {
        return map;
    }

    /**
     * Этот метод просматривает все открытые точки и возвращает точку с
     * минимальным общим значением.
     * Если нет открытых точек, метод возвращает null.
     */
    
    public Waypoint getMinOpenWaypoint()
    {
        if (Opened.size() == 0) return null;

        Waypoint first = (Waypoint) Opened.values().toArray()[0];
        float min = first.getTotalCost();

        for(int i = 0; i < Opened.size();i++)
        {
            Waypoint wp1 = (Waypoint) Opened.values().toArray()[i];

            if(min >= wp1.getTotalCost())
            {
                min = wp1.getTotalCost();
                first = wp1;
            }
        }
        return first;
    }

    /**
     * Этот метод добавляет точку в коллекцию открытых точек.
     * Если в местополодении новой точки нет уде открытой новой точки,
     * то она добавляется в коллекцию. Однако, если в коллекции есть точка,
     * новая точка заменяет старую точку, если значение новой точки меньше
     * текущей.
     */
    
    public boolean addOpenWaypoint(Waypoint newWP)
    {
        if(!Opened.containsKey(newWP.getLocation())) {
            Opened.put(newWP.getLocation(), newWP);
            return true;
        }
        else
        {
            if(Opened.get(newWP.getLocation()).getRemainingCost() > newWP.getRemainingCost())
            {
                Opened.put(newWP.getLocation(), newWP);
                return true;
            }
        }
        return false;
    }


    /** Возвраащет количество открытых точек. **/
    public int numOpenWaypoints()
    {
        return Opened.size();
    }


    /**
     * Этот метод перемещает точку в указанном месте из открытого списка в закрытый.
     * из открытого списка в закрытый.
     **/
    public void closeWaypoint(Location loc)
    {
        Waypoint wp = Opened.get(loc);
        Opened.remove(loc);
        Closed.put(loc, wp);
    }

    /**
     * Возвращает true, если коллекция зыкрытых точек содержит точку
     * для указанного местоположения.
     **/
    public boolean isLocationClosed(Location loc)
    {
        if (Closed.containsKey(loc)) return true;
        return false;
    }
}

