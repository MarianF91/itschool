package course17.homework.challenge2;

import java.util.List;

public class HistoryViewerOrderHistoryImpl implements OrderHistory {

    @Override
    public void viewOrderHistory(List<Order> orders) {
        if (orders == null || orders.isEmpty()) {
            System.out.println("Order History is empty.");
            return;
        }

        System.out.println("History:");
        for (Order order : orders) {
            System.out.println("Order number: " + order.getOrderNumber() + ", Status: " + order.getOrderStatus());
            System.out.println("Products:");
            for (Product product : order.getProducts()) {
                System.out.println("  - " + product.getName() + " (" + product.getDescription() +
                        "), Price: " + product.getPrice() + ", Quantity: " + product.getQuantity());
            }
        }
    }
}
