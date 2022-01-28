import order.Order;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOrder {

    @Test
    public void testOrderWhenCreatedHasNoItems(){
        Order order = new Order();
        assertEquals(0,order.itemsCount());
    }
}
