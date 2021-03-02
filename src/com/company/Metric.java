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
    public static final double KM_IN_ONE_MI = 1.609;

    public static double milesToKilometers(double miles) {
        return miles * KM_IN_ONE_MI;
    }

    public static double kilometersToMiles(double km) {
        return km / KM_IN_ONE_MI;
    }
}

