package products;

import lombok.Getter;
import lombok.Setter;

public class Iphone extends Product{
    @Getter
    @Setter
    private int ram;
    public Iphone(double price, boolean available, int ram){
        super(price, available);
        this.ram = ram;
    }
}
