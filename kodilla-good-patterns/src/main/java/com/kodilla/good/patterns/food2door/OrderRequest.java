package com.kodilla.good.patterns.food2door;


import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime timeOrder;
    private Product product;
    private Company company;


    public OrderRequest(final User user, final LocalDateTime timeOrder, final Product product, final Company company) {
        this.user = user;
        this.timeOrder = timeOrder;
        this.product = product;
        this.company = company;
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

    public Company getCompany() {
        return company;
    }
}
