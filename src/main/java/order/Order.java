package order;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderItem> items = new ArrayList<OrderItem>();
    private double totalPrice;
    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public int itemsCount(){
        return items.size();
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }
}


