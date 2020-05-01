package com.kodilla.good.patterns.food2door;



import java.time.LocalDateTime;

public class HealthyShopOrderService implements OrderService {
    @Override
    public boolean order(User user, LocalDateTime timeOrder, Product product, Company company) {
        return true;
    }
}
