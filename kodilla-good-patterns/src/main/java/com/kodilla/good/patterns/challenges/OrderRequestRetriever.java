package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Jan123", "j.kowalski1968@gmail.com");
        LocalDateTime timeOrder =  LocalDateTime.of(2020,5, 12, 20,20);
        Item item = new Item("284992","Slippers");


        return new OrderRequest(user, timeOrder, item);

    }
}
