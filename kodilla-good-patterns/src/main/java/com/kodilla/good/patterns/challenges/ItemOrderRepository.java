package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ItemOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(final User user,final LocalDateTime timeOrder,final Item item) {
        return true;
    }
}
