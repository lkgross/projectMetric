package com.company;

import java.util.Scanner;
import java.io.*;

public class MetricDemo {
    public static void main(String[] args) throws IOException     {
        FileWriter fw = new FileWriter("metricOut.txt",true);
        PrintWriter outputFile = new PrintWriter(fw);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a distance in miles: ");
        double miles = keyboard.nextDouble();
        double km = Metric.milesToKilometers(miles);
        outputFile.printf("%.2f", km);
        outputFile.println();
        outputFile.close();
    }
}
