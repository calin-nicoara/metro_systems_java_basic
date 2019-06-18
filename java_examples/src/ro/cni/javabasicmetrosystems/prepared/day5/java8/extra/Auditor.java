package ro.cni.javabasicmetrosystems.prepared.day5.java8.extra;

import java.math.BigDecimal;
import java.util.List;

public class Auditor implements Accountant{
    @Override
    public BigDecimal calculateTaxes(final List<BigDecimal> bigDecimals) {
        return bigDecimals.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
