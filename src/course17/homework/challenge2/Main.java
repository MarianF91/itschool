package course17.homework.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("First Customer", "customer1@mail.com", "1 First Street",
                "1 First Street");

        Product product1 = new Product("Laptop - Basic Use", "Home Edition Laptop", 1200.0, 10);
        Product product2 = new Product("Laptop - Industrial Use", "Industrial Edition Laptop", 2200, 15);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Order order = new Order((int) (Math.random() * 1000), customer, products);
        customer.addOrder(order);

        Payment payment = new Payment();
        payment.processPayment();

        order.status("Shipped");

        customer.viewHistory();
    }
}