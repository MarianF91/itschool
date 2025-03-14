package course19.homework.frequentitemsinashoppingcart;

import java.util.List;

public class Cart {
    private final List<Product> productList;

    public Cart(List<Product> productList) {
        this.productList = productList;
    }

    protected List<Product> getProductList() {
        return productList;
    }
}
