package course17.homework.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String email;
    private final List<Order> orderHistory;
    private final OrderHistory orderHistoryViewer;

    public Customer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.orderHistory = new ArrayList<>();
        this.orderHistoryViewer = new HistoryViewerOrderHistoryImpl();
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

    public void viewHistory() {
        orderHistoryViewer.viewOrderHistory(orderHistory);
    }

    public void addOrder(Order order) {
        this.orderHistory.add(order);
    }
}