package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param c
     * This is a candidate city to add
     */
    public void add(City c) {
        if (cities.contains(c)) {
            throw new IllegalArgumentException();
        }
        cities.add(c);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks whether a city belongs in the list or not
     * @param city
     * @return
     * Returns true or false
     */
    public boolean hasCity(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        return cities.contains(city);
    }

    /**
     * This method removes a city and returns number of cities
     * @param city
     * @return
     * Returns number of cities in list
     */
    public int countCities(City city) {
        cities.remove(city);
        return cities.size();
    }
}

