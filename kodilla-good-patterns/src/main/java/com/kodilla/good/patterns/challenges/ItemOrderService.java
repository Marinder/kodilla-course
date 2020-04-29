package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ItemOrderService implements OrderService {
    @Override
    public boolean order(final User user,final LocalDateTime timeOrder,final Item item) {
        System.out.println("Item: " + item.getName() + " is ordering by " + user.getNick() + " at " + timeOrder.toString());
        return true;
    }
}
