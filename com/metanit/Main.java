package com.metanit;

import classes.Vehicle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rashod;
        int sr_skorost;
        String transport_sredstvo;

        System.out.println("What is the vehicle's consumption of liters per 100 km(liter/100km)? ");
        rashod = in.nextInt();
        System.out.println("What is the average speed of the vehicle(km/h)? ");
        sr_skorost = in.nextInt();
        System.out.println("What type of vehicle does it belong to? ");
        transport_sredstvo = in.next();

        Vehicle vehicle = new Vehicle(rashod, sr_skorost, transport_sredstvo);

        System.out.println("How long did the vehicle drive(in km)? ");
        double distanse;
        distanse = in.nextDouble();

        System.out.println("Overcoming time: ");
        vehicle.Time_r(distanse, sr_skorost);
        System.out.println("Spend gasoline: ");
        vehicle.Dezil_r(rashod, distanse);
    }
}
