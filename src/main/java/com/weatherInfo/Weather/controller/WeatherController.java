package com.weatherInfo.Weather.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weatherInfo.Weather.model.WeatherInfo;
import com.weatherInfo.Weather.service.WeatherService;

import java.io.IOException;

@RestController
public class WeatherController {

 private final WeatherService weatherService;

 public WeatherController(WeatherService weatherService) {
     this.weatherService = weatherService;
 }

 @GetMapping("/api/weather/{pincode}")
 public WeatherInfo getWeather(@PathVariable String pincode, @RequestParam String date) throws IOException {
     return weatherService.getWeatherByPincode(pincode, date);
 }
}

