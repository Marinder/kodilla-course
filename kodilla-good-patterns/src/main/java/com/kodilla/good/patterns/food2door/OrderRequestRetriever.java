package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Jan123", "j.kowalski1968@gmail.com");
        LocalDateTime timeOrder =  LocalDateTime.of(2020,5, 12, 20,20);
        Product product = new Product("ExtraFoodShop","Chia seeds 0,5KG", 1);

        return new OrderRequest(user, timeOrder, product);

    }
}
