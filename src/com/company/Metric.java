package com.company;

public class Metric {
    public static final double FACTOR_MI_TO_KM = 1.609;

    public static double milesToKilometers(double miles) {
        return miles * FACTOR_MI_TO_KM;
    }

    public static double kilometersToMiles(double km) {
        return km / FACTOR_MI_TO_KM;
    }
}

