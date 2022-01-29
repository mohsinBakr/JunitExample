package order;

public class OrderItem {
    private int id;
    private double price;
    private String name;

    public OrderItem(String itemName,double itemPrice){
        this.price = itemPrice;
        this.name = itemName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
