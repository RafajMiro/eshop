package products;

public class AppleWatch extends Product{
    private int displaySize;
    public AppleWatch(double price, boolean available, int displaySize){
        super(price, available);
        this.displaySize = displaySize;
    }
}
