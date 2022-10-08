package com.kodilla.weather;

import java.util.HashMap;
import java.util.Map;

public class AllTemperatures {
    Temperatures temperatures1;

    public AllTemperatures(Temperatures temperatures1) {
        this.temperatures1 = temperatures1;
    }

    public HashMap<Integer, Double> MeanOfAllTemperatures() {
        HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();

        for (Map.Entry<Integer, Double> temperature : temperatures1.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 0);
        }
        return resultMap;
    }
}

