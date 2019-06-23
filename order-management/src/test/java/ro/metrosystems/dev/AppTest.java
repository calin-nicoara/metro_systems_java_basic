package ro.metrosystems.dev;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        List<ShoppingCart> shoppingCarts = new ArrayList<>();
        shoppingCarts.add(new ShoppingCart(BigDecimal.valueOf(200), 10L, "Gigi"));
        shoppingCarts.add(new ShoppingCart(BigDecimal.valueOf(150), 6L, "Gigi"));
        shoppingCarts.add(new ShoppingCart(BigDecimal.valueOf(25), 4L, "Marius"));
        List<ShoppingCart> gigi = App.getShoppingCartByClient("Gigi", shoppingCarts);

        gigi.forEach(s -> {
            assertEquals("Gigi", s.getClientName());
            assertNotSame(s.getClientName(), new String("Gigi"));
        });
    }
}
