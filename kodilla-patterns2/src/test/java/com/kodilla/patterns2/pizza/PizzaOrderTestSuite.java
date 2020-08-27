package com.kodilla.patterns2.pizza;

import com.kodilla.patterns2.decorator.pizza.BasicPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.PizzaExtraCheeeseDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaHamMushroomsOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetComponent() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getComponent());
        //When
        String component = theOrder.getComponent();
        //Then
        assertEquals("Pizza: tomato sauce + cheese", component);
    }

    @Test
    public void testPizzaExtraCheeseOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaExtraCheeeseDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17), calculatedCost);
    }

    @Test
    public void testPizzaExtraCheeseOrderGetComponent() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaExtraCheeeseDecorator(theOrder);
        System.out.println(theOrder.getComponent());
        //When
        String component = theOrder.getComponent();
        //Then
        assertEquals("Pizza: tomato sauce + cheese + extra cheese", component);
    }

    @Test
    public void testPizzaHamMushroomsExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaExtraCheeeseDecorator(theOrder);
        theOrder = new PizzaHamMushroomsOrderDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testPizzaHamMushroomsExtraCheeseGetComponent() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaExtraCheeeseDecorator(theOrder);
        theOrder = new PizzaHamMushroomsOrderDecorator(theOrder);
        System.out.println(theOrder.getComponent());
        //When
        String component = theOrder.getComponent();
        //Then
        assertEquals("Pizza: tomato sauce + cheese + extra cheese + ham + mushrooms", component);
    }
}
