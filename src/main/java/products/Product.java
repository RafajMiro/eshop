package products;

import lombok.Getter;
import lombok.Setter;

public abstract class Product {
    @Getter
    @Setter
    protected double price;
    @Getter
    @Setter
    protected boolean available;
    public Product(double price, boolean available){
        this.price = price;
        this.available = available;
    }

}
