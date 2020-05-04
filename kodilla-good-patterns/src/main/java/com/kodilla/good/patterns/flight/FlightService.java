package com.kodilla.good.patterns.flight;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {

    private  String via;

    public void fromAirport(Set<Flight>theFlightList, String departureAirport) {
        theFlightList.stream()
                .filter(entry -> entry.getDepartureAirport().equals(departureAirport))
                .forEach(System.out::println);
    }

    public void toAirport(Set<Flight>theFlightList, String arrivalAirport) {
        theFlightList.stream()
                .filter(entry -> entry.getArrivalAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void viaAirport(Set<Flight>theFlightList, String departureAirport,String via, String arrivalAirport ) {
        Set<Flight> theFlightListDeparture = theFlightList.stream()
                .filter(entry -> entry.getDepartureAirport().equals(departureAirport))
                .filter(entry -> entry.getArrivalAirport().equals(via))
                .collect(Collectors.toSet());

        Set<Flight> theFlightListArrival = theFlightList.stream()
                .filter(entry -> entry.getArrivalAirport().equals(arrivalAirport))
                .filter(entry -> entry.getDepartureAirport().equals(via))
                .collect(Collectors.toSet());

        Set<Flight> theFlightListDepartureViaArrival = new HashSet<>();
        theFlightListDepartureViaArrival.addAll(theFlightListDeparture);
        theFlightListDepartureViaArrival.addAll(theFlightListArrival);
        System.out.println(theFlightListDepartureViaArrival);
    }
}
