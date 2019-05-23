package ro.cni.javabasicmetrosystems.live.day3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigDecimalMain {
    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(4.5);
        BigDecimal number1 = BigDecimal.valueOf(2.6);
//        System.out.println(bigDecimal.unscaledValue());
//        System.out.println(bigDecimal.scale());

        System.out.println(bigDecimal.add(number1));
        System.out.println(bigDecimal.subtract(number1));
        System.out.println(bigDecimal.multiply(number1));
        System.out.println(bigDecimal.divide(number1, 3, RoundingMode.FLOOR));

        System.out.println(BigDecimal.valueOf(-10).abs());

        System.out.println(bigDecimal.max(number1));


        BigInteger bigInteger = BigInteger.valueOf(Integer.MAX_VALUE);
    }
}
