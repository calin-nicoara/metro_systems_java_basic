package ro.cni.javabasicmetrosystems.prepared.day5.java8.lambdas;

import java.util.function.Consumer;

public class LambdaMain {
    public static void main(String[] args) {
        Consumer<Integer> consumer = number -> System.out.println(number*2);

        consumeMe(consumer);

        consumeMe(number -> System.out.println(number*3));

        consumeMe(number -> acceptAndShout(number));
        consumeMe(LambdaMain::acceptAndShout);
    }

    public static void consumeMe(Consumer<Integer> consumer) {
        consumer.accept(20);
    }

    public static void acceptAndShout(Integer number) {
        System.out.println("NUMBER IS: " + number);
    }
}
