package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private  List<Country> listCountryOnContinent = new ArrayList<>();

    public Continent(List<Country> listCountryOnContinent){
        this.listCountryOnContinent = listCountryOnContinent;
    }


    public List<Country> getListCountryOnContinent() {
        return listCountryOnContinent;
    }
}
