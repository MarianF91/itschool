package course20and21.challenge5;

import java.util.Objects;

public class Product {
    private final String name;
    private final int price;
    private final int id;

    public Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Product product = (Product) object;
        return id == product.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
