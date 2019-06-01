package ro.cni.javabasicmetrosystems.prepared.day4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainGenericWildcards {
    public static void main(String[] args) {
//        showNumbers(Arrays.asList(1, 4, 5, 10));
//        showListUnbounded(Arrays.asList(1, 2, 3));
//        showListUnbounded(Arrays.asList("1", "2", "3"));

        showObjectList(Arrays.asList(1, 2));

        subTyping();
    }

    private static void subTyping() {
        List<? extends Integer> integers = new ArrayList<>();
        List<? extends Number> numbers = integers;
    }

    private static void showListUnbounded(List<?> list) {
        for(Object elem: list) {
            System.out.println(elem);
        }
        System.out.println();
    }

    private static void showObjectList(List<Object> list) {
        for(Object elem: list) {
            System.out.println(elem);
        }
        System.out.println();
    }

    private static double addNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for(Number n: numbers) {
            sum += n.doubleValue();
        }
        return sum;
    }

    private static void addSomeNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
