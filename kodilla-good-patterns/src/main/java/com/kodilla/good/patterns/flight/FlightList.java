package com.kodilla.good.patterns.flight;

import java.util.HashSet;
import java.util.Set;

public class FlightList {


    public static Set<Flight> getTheFlightList() {
        Set<Flight> theFlightList = new HashSet<>();

        theFlightList.add(new Flight("Poznan", "London"));
        theFlightList.add(new Flight("London", "Poznan"));
        theFlightList.add(new Flight("Pekin", "Warsaw"));
        theFlightList.add(new Flight("Poznan", "Pekin"));
        theFlightList.add(new Flight("Moscow", "Paris"));
        theFlightList.add(new Flight("Warsaw", "Berlin"));

        return new HashSet<Flight>(theFlightList);
    }
}
