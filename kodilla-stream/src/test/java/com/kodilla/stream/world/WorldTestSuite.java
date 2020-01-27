package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        List<Country> europa = new ArrayList<>();
        Country england = new Country(new BigDecimal("123456789"));
        Country poland = new Country(new BigDecimal("123456789"));
        Country germany = new Country(new BigDecimal("123456789"));
        europa.add(england);
        europa.add(poland);
        europa.add(germany);
        Continent europas = new Continent(europa);
        List<Country> australian = new ArrayList<>();
        Country australia = new Country(new BigDecimal("123456789"));
        australian.add(australia);
        Continent australians = new Continent(australian);


        List<Country> asia = new ArrayList<>();
        Country china = new Country(new BigDecimal("123456789"));
        asia.add(china);
        Continent asian = new Continent(asia);


        List<Continent> listContinent = new ArrayList<>();
        listContinent.add(europas);
        listContinent.add(australians);
        listContinent.add(asian);

        World world = new World(listContinent);
        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal assumedTotalPeuople = new BigDecimal("617283945");
        Assert.assertEquals(assumedTotalPeuople,totalPeople);
    }

}
