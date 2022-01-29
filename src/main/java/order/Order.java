package order;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderItem> items = new ArrayList<OrderItem>();
    private double totalPrice = 0;
    private OrderStatus status  = OrderStatus.OPEN;
    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public int itemsCount(){
        return items.size();
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }
    public OrderStatus getStatus(){
        return this.status;
    }
    public ArrayList<OrderItem> addItem(OrderItem item){
        if (item != null){
            items.add(item);
            totalPrice += item.getPrice();
        }
        return items;
    }

    public ArrayList<OrderItem> removeItem(String itemName){
        for (int i =0 ; i < items.size(); i++){
            if (itemName.equals(items.get(i).getName())){
                items.remove(i);
                return items;
            }
        }
        System.out.println("Item not found in order");
        return items;
    }
    public boolean proceedToCheckout(double userBalance) throws Exception {
        // not a good design
        if (userBalance < this.totalPrice){
            System.out.println("Insufficient balance");
//            throw new Exception("Insufficient balance");
            return false;
        }
        if (this.items.size() != 0){
            System.out.println("No items selected");
//            throw new Exception("No items selected");
            return false;
        }
        this.status = OrderStatus.PLACED;
        return true;
    }
}


