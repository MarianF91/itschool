package course17.homework.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("First Customer", "customer1@mail.com",
                "1 First Street", "1 First Street");

        Product product1 = new Product("Laptop - Basic Use", "Home Edition Laptop",
                1200.0, 10);
        Product product2 = new Product("Laptop - Industrial Use",
                "Industrial Edition Laptop", 2200, 15);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Order order = new Order((int) (Math.random() * 1000), products);
        customer.addOrder(order);

        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.price();
        }

        Payment payment = new Payment("Card", totalAmount);
        payment.processPayment();

        order.status(OrderStatus.SHIPPED);

        customer.viewHistory();

        System.out.println("\nCustomer info: " + "\n- Name: " + customer.getName() + "\n- Email: " + customer.getEmail()
                + "\n- Shipping Address: " + customer.getShippingAddress() + "\n- Billing Address: " + customer.getBillingAddress());
    }
}