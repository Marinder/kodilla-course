package com.kodilla.good.patterns.food2door;


import java.time.LocalDateTime;

public class ExtraFoodShopOrderRepository implements  OrderRepository{
    @Override
    public boolean createOrder(User user, LocalDateTime timeOrder, Product product) {
        return true;
    }
}
