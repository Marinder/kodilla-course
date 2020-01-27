package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private  List<Continent> listContinent = new ArrayList<>();

    public World(List<Continent> listContinent){
        this.listContinent = listContinent;
    }

    public BigDecimal getPeopleQuantity(){
        return listContinent.stream()
                .flatMap(continent -> continent.getListCountryOnContinent().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}
