package course19.homework.frequentitemsinashoppingcart;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = shopping();
        Map<Product, Integer> productFrequency = countProductFrequency(customers);
        listMostFrequentProducts(productFrequency);
    }

    public static List<Customer> shopping() {
        List<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer("First Customer");
        List<Product> firstProductsList = new ArrayList<>();
        firstProductsList.add(Product.MILK);
        firstProductsList.add(Product.COW_CHEESE);
        firstProductsList.add(Product.CHEDDAR);
        firstProductsList.add(Product.NONFAT_MILK);
        firstProductsList.add(Product.GOAT_CHEESE);
        firstProductsList.add(Product.SMOKED_CHEESE);

        Cart firstShoppingCart = new Cart(firstProductsList);
        customer1.setShoppingCart(firstShoppingCart);
        customer1.showShoppingCart();

        customers.add(customer1);

        Customer customer2 = new Customer("Second Customer");
        List<Product> secondProductsList = new ArrayList<>();
        secondProductsList.add(Product.SMOKED_CHEESE);
        secondProductsList.add(Product.GOAT_CHEESE);
        secondProductsList.add(Product.SHEEP_CHEESE);
        secondProductsList.add(Product.MILK);
        secondProductsList.add(Product.NONFAT_MILK);
        secondProductsList.add(Product.COW_CHEESE);

        Cart secondShoppingCart = new Cart(secondProductsList);
        customer2.setShoppingCart(secondShoppingCart);
        customer2.showShoppingCart();

        customers.add(customer2);

        Customer customer3 = new Customer("Third Customer");
        List<Product> thirdProductsList = new ArrayList<>();
        thirdProductsList.add(Product.LOW_FAT_MILK);
        thirdProductsList.add(Product.NONFAT_MILK);
        thirdProductsList.add(Product.MILK);
        thirdProductsList.add(Product.SMOKED_CHEESE);
        thirdProductsList.add(Product.SHEEP_CHEESE);
        thirdProductsList.add(Product.COW_CHEESE);

        Cart thirdShoppingCat = new Cart(thirdProductsList);
        customer3.setShoppingCart(thirdShoppingCat);
        customer3.showShoppingCart();

        customers.add(customer3);

        return customers;
    }

    public static Map<Product, Integer> countProductFrequency(List<Customer> customers) {
        Map<Product, Integer> productFrequency = new HashMap<>();
        for (Customer customer : customers) {
            for (Product product : customer.getShoppingCart().getProductList()) {
                productFrequency.put(product, productFrequency.getOrDefault(product, 0) + 1);
            }
        }
        return productFrequency;
    }

    public static void listMostFrequentProducts(Map<Product, Integer> productFrequency) {
        List<Map.Entry<Product, Integer>> sortedProducts = new ArrayList<>(productFrequency.entrySet());
        sortedProducts.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("\nMost Frequent Products:");
        for (Map.Entry<Product, Integer> entry : sortedProducts) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
