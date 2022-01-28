import order.Order;
import order.OrderItem;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOrder {
    Order order ;
    @Test
    public void testOrderWhenCreatedHasNoItems(){
        Order order = new Order();
        assertEquals(0,order.itemsCount());
    }

    @Before
    public void setup(){
        order = new Order();
    }
    @Test
    public void testOrderAddItemIncreasesOrderItemsCountByOne(){
        assertEquals(0,order.itemsCount());
        OrderItem item = new OrderItem();
        item.setId(1);
        item.setName("Pepsi");
        item.setPrice(5.0);
        int itemsCount = order.addItem(item).size();
        assertEquals(1,itemsCount);
    }

    @Test
    public void testOrderAddItemIncreasesOrderTotalPriceByItemPrice(){
        assertEquals(0,order.itemsCount());
        OrderItem item = new OrderItem();
        item.setId(1);
        item.setName("Pepsi");
        item.setPrice(5.0);
        order.addItem(item);
        assertEquals(5,order.getTotalPrice(),1e-15);
    }
}
