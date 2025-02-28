package course17.homework.challenge2;

import java.util.List;

public class Order {

    private final int orderNumber;
    private OrderStatus orderStatus;
    private final List<Product> products;

    public Order(int orderNumber, List<Product> products) {
        this.orderNumber = orderNumber;
        this.products = products;
        this.orderStatus = OrderStatus.PLACED;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void status(OrderStatus statusUpdate) {
        this.orderStatus = statusUpdate;
        System.out.println("Order: " + orderNumber + " has been updated to " + orderStatus);
    }
}