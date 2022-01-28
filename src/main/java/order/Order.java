package order;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderItem> items = new ArrayList<OrderItem>();
    private double totalPrice = 0;
    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public int itemsCount(){
        return items.size();
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public ArrayList<OrderItem> addItem(OrderItem item){
        if (item != null){
            items.add(item);
            totalPrice += item.getPrice();
        }
        return items;
    }
}


