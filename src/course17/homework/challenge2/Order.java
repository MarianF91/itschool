package course17.homework.challenge2;

import java.util.List;

public class Order {

    private final int orderNumber;
    private Product productInformation;
    private String orderStatus;
    List<Product> products;

    public Order(int orderNumber,
                 Customer customerInformation,
                 List<Product> products) {
        this.orderNumber = orderNumber;
        this.products = products;
        this.orderStatus = "Placed";
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void status(String statusUpdate) {
        this.orderStatus = statusUpdate;
        System.out.println("Order: " + orderNumber + " has been updated to " + orderStatus);
    }
}