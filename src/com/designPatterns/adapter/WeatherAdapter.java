package com.designPatterns.adapter;

public class WeatherAdapter {
    public int findTemperature(int zipcode) {
        String city = null;
        if (zipcode == 19406) {
            city = "bla bla";
        }
        WeatherFinder weatherFinder= new WeatherFinderImpl();
        int temp = weatherFinder.findWeather(city);
        return temp;
    }
}
