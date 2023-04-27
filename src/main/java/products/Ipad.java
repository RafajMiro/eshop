package products;

import lombok.Getter;
import lombok.Setter;

public class Ipad extends Product{
    @Getter
    @Setter
    private boolean simSlot;
    public Ipad(double price, boolean available, boolean simSlot){
        super(price, available);
        this.simSlot = simSlot;
    }


}
