package com.weatherInfo.Weather.model;


import lombok.Data;

@Data
public class WeatherInfo {
 private String pincode;
 private double temperature;
 private String description;
 private String date; // Date for which the weather info is provided
}

