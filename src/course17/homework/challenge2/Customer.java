package course17.homework.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String email;
    private final String shippingAddress;
    private final String billingAddress;
    private final List<Order> orderHistory;

    public Customer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.orderHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addOrder(Order order) {
        this.orderHistory.add(order);
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void viewHistory() {
        if (orderHistory.isEmpty()) { // orderHistory cannot be null because initialized in constructor
            System.out.println("Order History is empty.");
            return;
        }

        System.out.println("History:");
        for (Order order : orderHistory) {
            System.out.println("Order number: " + order.getOrderNumber() +
                    ", Status: " + order.getOrderStatus());
            System.out.println("Products:");
            for (Product product : order.getProducts()) {
                System.out.println("  - " + product.name() +
                        " (" + product.description() + "), Price: "
                        + product.price() + ", Quantity: " + product.quantity());
            }
        }
    }
}