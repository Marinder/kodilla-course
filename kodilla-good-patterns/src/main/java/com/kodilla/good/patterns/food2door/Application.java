package com.kodilla.good.patterns.food2door;



public class Application {
    public static void main (String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        ProductOrderService processProductOrderService = new ProductOrderService(new MailService(), new ExtraFoodShopOrderService(), new ExtraFoodShopOrderRepository());
        processProductOrderService.process(orderRequest);
    }
}
