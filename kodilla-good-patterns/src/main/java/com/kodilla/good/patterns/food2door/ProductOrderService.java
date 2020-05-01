package com.kodilla.good.patterns.food2door;



public class ProductOrderService  {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getTimeOrder(),
                orderRequest.getProduct(), orderRequest.getCompany());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getTimeOrder(), orderRequest.getProduct(), orderRequest.getCompany());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
