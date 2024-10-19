package com.weatherInfo.Weather.service;

//src/main/java/com/yourpackage/service/WeatherService.java

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weatherInfo.Weather.model.WeatherInfo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class WeatherService {

 

 private final String DATA_FILE = "src/main/resources/data/weatherData.json";


 // In WeatherService
 public WeatherInfo getWeatherByPincode(String pincode, String date) throws IOException {
     ObjectMapper mapper = new ObjectMapper();
     List<WeatherInfo> weatherData = mapper.readValue(Files.readAllBytes(Paths.get(DATA_FILE)), new TypeReference<>() {});

     return weatherData.stream()
             .filter(info -> info.getPincode().equals(pincode) && info.getDate().equals(date))
             .findFirst()
             .orElse(null);
 }





 }

