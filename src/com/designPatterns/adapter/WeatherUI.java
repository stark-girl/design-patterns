package com.designPatterns.adapter;

public class WeatherUI {
    public static void main(String arg[]){
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        System.out.println(weatherAdapter.findTemperature(19406));
    }
}
