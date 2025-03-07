package course19.homework.frequentitemsinashoppingcart;

public class Customer {

    private final String name;
    private Cart shoppingCart;

    public Customer(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    public void setShoppingCart(Cart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Cart getShoppingCart() {
        return shoppingCart;
    }

    public void showShoppingCart() {
        System.out.println("\nClient: " + getName() + "\nShopping Cart contents: ");
        for (Product product : shoppingCart.getProductList()){
            System.out.println("- " + product);
        }
    }
}
