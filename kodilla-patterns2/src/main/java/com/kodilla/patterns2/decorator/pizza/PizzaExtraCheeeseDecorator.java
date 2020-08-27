package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaExtraCheeeseDecorator extends AbstractPizzaOrderDecorator {
    public PizzaExtraCheeeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getComponent() {
        return super.getComponent() + " + extra cheese";
    }
}
