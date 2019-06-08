package ro.cni.javabasicmetrosystems.prepared.day5.java8.extra;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public interface Accountant {
    BigDecimal calculateTaxes(List<BigDecimal> numbers);

    default void showDeduction(List<BigDecimal> expenses) {
        BigDecimal sum = BigDecimal.ZERO;
        for(BigDecimal expense: expenses) {
            sum = sum.add(expense);
        }
        System.out.println(sum.divide(BigDecimal.valueOf(5), 2, RoundingMode.CEILING));
    }
}
