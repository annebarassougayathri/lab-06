package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    private String city;
    private String province;

    /**
     * Constructor
     * @param city
     * @param province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This method gets city name
     * @return
     * Returns city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This method gets province name
     * @return
     * Returns province name
     */
    String getProvinceName(){
        return this.province;
    }

    @Override
    /**
     * This method compares cities based on city name field
     * @return -1 if the caller is greater than the city name field
     */
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    @Override
    /**
     * This methods checks if two cities are the same
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        City o1 = (City) o;
        return this.city.equals(o1.city) && this.province.equals(o1.province);
    }

    @Override
    /**
     * This method provides hashcode for city
     */
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}



