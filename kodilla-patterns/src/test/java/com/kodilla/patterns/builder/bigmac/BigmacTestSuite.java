package com.kodilla.patterns.builder.bigmac;


import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Cucumber")
                .burger(2)
                .bun("Sesame")
                .sauce("Spicy")
                .ingredient("Shrimp")
                .ingredient("Cheese")
                .ingredient("Onion")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(6, howManyIngredients);
    }
}
