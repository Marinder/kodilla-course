package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime timeOrder;
    private Item item;


    public OrderRequest(final User user, final LocalDateTime timeOrder, final Item item) {
        this.user = user;
        this.timeOrder = timeOrder;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getTimeOrder() {
        return timeOrder;
    }

    public Item getItem() {
        return item;
    }
}
