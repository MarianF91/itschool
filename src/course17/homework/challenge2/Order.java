package course17.homework.challenge2;

import java.util.List;

public class Order {

    private final int orderNumber;
    private final Customer customerInformation;
    private OrderStatus orderStatus;
    private final List<Product> products;

    public Order(int orderNumber, Customer customerInformation, List<Product> products) {
        this.orderNumber = orderNumber;
        this.customerInformation = customerInformation;
        this.products = products;
        this.orderStatus = OrderStatus.PLACED;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomerInformation() {
        return customerInformation;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void status(OrderStatus statusUpdate) {
        this.orderStatus = statusUpdate;
        System.out.println("Order: " + orderNumber + " has been updated to " + orderStatus);
    }
}