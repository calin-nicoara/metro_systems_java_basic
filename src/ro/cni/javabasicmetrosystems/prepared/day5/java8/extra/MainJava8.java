package ro.cni.javabasicmetrosystems.prepared.day5.java8.extra;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainJava8 {
    public static void main(String[] args) {
        List<BigDecimal> integerList = new ArrayList<>();
        Accountant accountant = list -> BigDecimal.ZERO;

        accountant.calculateTaxes(integerList);
    }
}
