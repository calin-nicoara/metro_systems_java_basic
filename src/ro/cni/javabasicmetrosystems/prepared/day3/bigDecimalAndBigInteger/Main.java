package ro.cni.javabasicmetrosystems.prepared.day3.bigDecimalAndBigInteger;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal test = BigDecimal.valueOf(25.43);

        System.out.println(test); // 25.43
        System.out.println();
        System.out.println("Scale: " + test.scale()); // Scale: 2
        System.out.println("Unscaled value: " + test.unscaledValue());// Unscaled value: 2543;

        //operations
        System.out.println();
        System.out.println(test.add(BigDecimal.TEN)); // 35.43
        System.out.println(test.subtract(BigDecimal.TEN)); // 15.43
        System.out.println(test.multiply(BigDecimal.valueOf(1231231232, 3))); // 31310210.22976

        System.out.println(test.divide(BigDecimal.TEN, RoundingMode.HALF_EVEN)); // 2.54
        System.out.println(test.divide(BigDecimal.TEN, 3, RoundingMode.HALF_EVEN)); // 2.543

        //extra operations
        System.out.println();
        System.out.println(test.max(BigDecimal.valueOf(10)));
        System.out.println(test.min(BigDecimal.valueOf(10)));

        System.out.println(test.intValue());

        System.out.println(test.negate());
        System.out.println(BigDecimal.valueOf(-20).plus());
    }
}
