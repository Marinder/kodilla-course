package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> listCountryOnContinent = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getListCountryOnContinent() {
        return listCountryOnContinent;
    }

    public boolean addCountry(Country country){
        return listCountryOnContinent.add(country);
    }
}
