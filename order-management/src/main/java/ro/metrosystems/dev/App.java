package ro.metrosystems.dev;

import org.apache.commons.lang3.RandomUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(RandomUtils.nextLong());
        System.out.println( "Hello World!" );
    }

    public static List<ro.metrosystems.dev.ShoppingCart> getShoppingCartByClient(
            final String clientName, List<ro.metrosystems.dev.ShoppingCart> initialList) {
         return initialList.stream()
                .filter(s -> s.getClientName().equals(clientName))
                .collect(Collectors.toList());
    }

    public static int throwsExceptionOrReturnValue(boolean throwException) {
        if(throwException) {
            throw new RuntimeException("Was thrown!");
        }

        return 0;
    }
}
