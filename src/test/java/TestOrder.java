import order.Order;
import order.OrderItem;
import order.OrderStatus;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestOrder {
    Order order ;
    @Before
    public void setup(){
        order = new Order();
    }
    @Test
    public void testOrderWhenCreatedHasNoItems(){
        Order order = new Order();
        assertEquals(0,order.itemsCount());
    }

    @Test
    public void testOrderAddItemIncreasesOrderItemsCountByOne(){
        assertEquals(0,order.itemsCount());
        OrderItem item = new OrderItem("Pepsi",5.0);
        int itemsCount = order.addItem(item).size();
        assertEquals(1,itemsCount);
    }

    @Test
    public void testOrderAddItemIncreasesOrderTotalPriceByItemPrice(){
        assertEquals(0,order.itemsCount());
        OrderItem item = new OrderItem("Bread",2.5);
        order.addItem(item);
        assertEquals(2.5,order.getTotalPrice(),1e-15);
    }

    @Test
    public void testOrderRemoveItemFromOrder(){
        order.addItem(new OrderItem("Chips",10));
        order.addItem(new OrderItem("Water",3));
        order.addItem(new OrderItem("Nescafe",100));
        String toBeRemovedItemName = "Water";
        ArrayList<OrderItem> items = order.removeItem(toBeRemovedItemName);
        assertFalse("Item "+toBeRemovedItemName+ " found in order", items.stream().anyMatch(e -> e.getName().equals(toBeRemovedItemName)));
        assertEquals(2,items.size());
    }
    @Test
    public void testOrderProceedToCheckoutFailsWithInsufficientBalanceDoesntChangeOrderStatus() throws Exception {
        order = new Order();
        double userBalance = 3.0;
        order.addItem(new OrderItem("Juice",12.0));
        order.proceedToCheckout(userBalance);
        assertEquals(OrderStatus.OPEN,order.getStatus());
    }
}
