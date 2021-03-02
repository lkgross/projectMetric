package com.company;

/**
 * Metric -
 * A (utility) class that contains static methods related to metric conversion
 * <p>
 * Starter code Laura K. Gross, laura.gross@bridgew.edu, 3/2021
 * <p>
 * Completed by: [student name], [student email], [date of completion]
 */
public class Metric {
    public static final double FACTOR_MI_TO_KM = 1.609;

    public static double milesToKilometers(double miles) {
        return miles * FACTOR_MI_TO_KM;
    }

    public static double kilometersToMiles(double km) {
        return km / FACTOR_MI_TO_KM;
    }
}

