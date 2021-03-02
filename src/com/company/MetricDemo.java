package com.company;
import java.util.Scanner;

/**
 * MetricDemo -
 * A class that contains uses the Metric class
 * <p>
 * Starter code Laura K. Gross, laura.gross@bridgew.edu, 3/2021
 * <p>
 * Completed by: [student name], [student email], [date of completion]
 */
public class MetricDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a distance in miles: ");
        double miles = keyboard.nextDouble();
        System.out.printf("%.2f miles is %.2f kilometers.\n", miles, Metric.milesToKilometers(miles));
        System.out.print("Enter a distance in km: ");
        double km = keyboard.nextDouble();
        System.out.printf("%.2f km is %.2f miles.\n", km, Metric.kilometersToMiles(km));
    }
}
