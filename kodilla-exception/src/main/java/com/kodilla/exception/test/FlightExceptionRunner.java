package com.kodilla.exception.test;

import java.util.Map;

public class FlightExceptionRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Poznan");
        FindAirport findAirport = new FindAirport();

        try {
            findAirport.findFilght(flight);
        } catch (RouteNotFoundException e){
            System.out.println("Flight not find.");
        } finally {
            System.out.println("End of search.");
        }
    }
}
