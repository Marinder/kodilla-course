package com.kodilla.good.patterns.food2door;



import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(User user, LocalDateTime timeOrder,Product product, Company company);
}
