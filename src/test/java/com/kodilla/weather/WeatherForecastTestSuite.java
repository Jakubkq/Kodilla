package com.kodilla.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub(){
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    public void testMeanOfAllTemperatures(){
        //Given
        Temperatures temperatures1 = new TemperaturesStub();
        AllTemperatures allTemperatures = new AllTemperatures(temperatures1);

        //When
        int MeanTemperatures = allTemperatures.MeanOfAllTemperatures().size();

        //Then
        Assertions.assertEquals(27, MeanTemperatures);
    }
}

