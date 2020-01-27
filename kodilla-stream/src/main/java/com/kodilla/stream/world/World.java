package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> listContinent = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return listContinent.add(continent);
    }

}
