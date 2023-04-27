package manager;

import lombok.Getter;
import products.AppleWatch;
import products.Ipad;
import products.Iphone;
import products.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderManager {
    private List<Product> products;
    public OrderManager(){
        this.products = new ArrayList<>();
    }
    public void AddIphone(double price, boolean available, int ram){
        this.products.add(new Iphone(price, available, ram));
    }
    public void AddIpad(double price, boolean available, boolean simSlot){
        this.products.add(new Ipad(price, available, simSlot));
    }
    public void AddAppleWatch(double price, boolean available, int displaySize){
        this.products.add(new AppleWatch(price, available, displaySize));
    }
    public void PrintPriceAndAvailabilityOfTheCheapestItem(){
        Product cheapest = Collections.min(this.products, Comparator.comparingDouble(Product::getPrice));
        if(cheapest.isAvailable()){
            System.out.println("Prize of cheapest product is "+cheapest+"$ and it is available");
        }else{
            System.out.println("Prize of cheapest product is "+cheapest+"$ and it is not available");
        }
    }
}
