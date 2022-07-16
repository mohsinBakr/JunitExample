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
    double userBalance = 3.0;
    @Before
    public void setup(){
        order = new Order();
    }
    @Test
    public void testOrderWhenCreatedHasNoItems(){
        assertEquals(0,order.itemsCount());
    }

    @Ignore
    public void testOrderAddItemIncreasesOrderItemsCountByOne(){
    }

    @Ignore
    public void testOrderAddItemIncreasesOrderTotalPriceByItemPrice(){

    }

    @Ignore
    public void testOrderRemoveItemFromOrder(){

    }
    @Ignore
    public void testOrderProceedToCheckoutFailsWithInsufficientBalanceDoesntChangeOrderStatus() throws Exception {

    }
}
