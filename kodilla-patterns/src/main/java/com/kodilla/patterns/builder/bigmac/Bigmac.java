package com.kodilla.patterns.builder.bigmac;


import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final int burger;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private  int burger;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public Bigmac.BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public Bigmac.BigmacBuilder burger(int burger) {
            this.burger = burger;
            return this;
        }

        public Bigmac.BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Bigmac.BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burger, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final int burger, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burger = burger;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurger() {
        return burger;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac {" +
                "bun='" + bun + '\'' +
                ", burger='" + burger + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
