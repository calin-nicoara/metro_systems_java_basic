package ro.cni.javabasicmetrosystems.prepared.day4.boxed;

import java.util.ArrayList;
import java.util.List;

public class MainBoxed {
    public static void main(String[] args) {
        int number = new Integer(20);

        Integer boxedNumber = 20;

        final int i = Integer.parseInt("20");
        final Integer integer = Integer.valueOf("20");

        List<Integer> integers = new ArrayList<>();

        integers.add(20);
        integers.add(new Integer(10));

        System.out.println(integers);
    }
}
