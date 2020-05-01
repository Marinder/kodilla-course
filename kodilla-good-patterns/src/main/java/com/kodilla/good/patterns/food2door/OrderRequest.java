package com.kodilla.good.patterns.food2door;


import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime timeOrder;
    private Product product;

    public OrderRequest(final User user, final LocalDateTime timeOrder, final Product product) {
        this.user = user;
        this.timeOrder = timeOrder;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getTimeOrder() {
        return timeOrder;
    }

    public Product getProduct() {
        return product;
    }

}
