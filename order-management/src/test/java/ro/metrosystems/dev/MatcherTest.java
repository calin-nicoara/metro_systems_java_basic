package ro.metrosystems.dev;

import org.hamcrest.CoreMatchers;
import org.junit.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.anyOf;
import static org.junit.Assert.fail;

public class MatcherTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("this is before class!");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("this is after class!");
    }

    @Before
    public void before() {
        System.out.println("This is before the test!");
    }

    @After
    public void after() {
        System.out.println("This is after the test!");
    }

    @Test
    @Ignore
    public void newTest() {
        List<ShoppingCart> shoppingCarts = new ArrayList<>();
        ShoppingCart doru = new ShoppingCart(BigDecimal.valueOf(200), 10L, "Doru");
        ShoppingCart gigi = new ShoppingCart(BigDecimal.valueOf(200), 10L, "Gigi");
        shoppingCarts.add(gigi);
        shoppingCarts.add(new ShoppingCart(BigDecimal.valueOf(150), 6L, "Gigi"));
        shoppingCarts.add(new ShoppingCart(BigDecimal.valueOf(25), 4L, "Marius"));

//        Assert.assertThat(shoppingCarts, CoreMatchers.hasItem(doru));

//        Assert.assertThat(shoppingCarts,
//                both(CoreMatchers.hasItem(gigi)).and(not(CoreMatchers.hasItem(doru))));

        Assert.assertThat(shoppingCarts,  anyOf(
                CoreMatchers.hasItem(gigi),
                CoreMatchers.hasItem(doru)
        ));
    }

    @Test
    public void testDoesNotThrow() {

    }

    @Test
    public void testThrowsError() {
        try {
            App.throwsExceptionOrReturnValue(true);
            fail("Exception not thrown");
        } catch(Exception re) {
            Assert.assertEquals("Was thrown!", re.getMessage());
        }
    }

    @Test(expected = RuntimeException.class)
    public void testThrowsError2() {
        App.throwsExceptionOrReturnValue(true);
    }
}
