import order.Order;
import order.OrderItem;
import order.OrderStatus;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestOrder {
    Order order ;
    double userBalance = 3.0;
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
    }

    @Test
    public void testOrderAddItemIncreasesOrderTotalPriceByItemPrice(){

    }

    @Test
    public void testOrderRemoveItemFromOrder(){

    }
    @Test
    public void testOrderProceedToCheckoutFailsWithInsufficientBalanceDoesntChangeOrderStatus() throws Exception {

    }
}
