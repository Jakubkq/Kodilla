package com.kodilla.weather;

import java.util.HashMap;

public interface Temperatures {
    HashMap<Integer, Double> getTemperatures();

    HashMap<Integer, Double> getMeanOfAllTemperatures();
}
