import order.Order;
import order.OrderItem;
import order.OrderStatus;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestOrder {
    Order order ;
    OrderItem orderItem;
    double userBalance = 3.0;
    @Before
    public void setup(){
        order = new Order();
    }
    @Test
    public void testOrderWhenCreatedHasNoItems(){
        assertEquals(0,order.itemsCount());
    }

    @Test
    public void testOrderAddItemIncreasesOrderItemsCountByOne(){
        OrderItem Item1 = new OrderItem("Item1", 22);
        order.addItem(Item1);
        assertEquals(1,order.itemsCount());

    }

    @Test
    public void testOrderAddItemIncreasesOrderTotalPriceByItemPrice(){
        OrderItem Item1 = new OrderItem("Item1", 22);
        OrderItem Item2 = new OrderItem("Item2", 44);
        order.addItem(Item1);
        order.addItem(Item2);
        assertEquals(66.0,order.getTotalPrice());

    }

    @Test
    public void testOrderRemoveItemFromOrder(){
        OrderItem Item1 = new OrderItem("Item1", 22);
        OrderItem Item2 = new OrderItem("Item2", 44);
        OrderItem Item3 = new OrderItem("Item3", 66);
        order.addItem(Item1);
        order.addItem(Item2);
        order.addItem(Item3);
        assertEquals(3,order.itemsCount());
        order.removeItem("Item1");
        for (int i=0; i<order.itemsCount(); i++) {
            System.out.println(order.getItems());
            assertNotEquals("(Item1 - 22.000000)",order.getItems().get(i).toString());
        }




    }
    @Test
    public void testOrderProceedToCheckoutFailsWithInsufficientBalanceDoesntChangeOrderStatus() throws Exception {
        OrderItem Item1 = new OrderItem("Item1", 22);
        order.addItem(Item1);
        assertEquals(1,order.itemsCount());
        order.proceedToCheckout(10);
    }
}
