package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaHamMushroomsOrderDecorator extends AbstractPizzaOrderDecorator {
    public PizzaHamMushroomsOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(8));
    }

    @Override
    public String getComponent() {
        return super.getComponent() + " + ham + mushrooms";
    }
}
