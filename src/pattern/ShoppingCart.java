package pattern;

import model.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public double calculateTotal(){
        double sum = 0.0;
        for(Item item : items){
            sum += item.getTotalPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        double amount = calculateTotal();
        paymentMethod.pay(amount);
        System.out.println();
    }

}
