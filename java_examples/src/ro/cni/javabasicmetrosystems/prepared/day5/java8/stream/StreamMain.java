package ro.cni.javabasicmetrosystems.prepared.day5.java8.stream;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
//        beginningLambda();
//        peekSortDistinctLimit();
//        terminal();


//        groupBy();

//        joiningAndMap();
//        onlyOnce();

//        IntStream.range(0, 10).forEach(s -> System.out.println(s));

//        range();

//        Stream.of(1, 2, 2).forEach(s -> System.out.println(s));
    }

    private static void range() {
        IntSummaryStatistics intSummaryStatistics = IntStream.rangeClosed(0, 10).summaryStatistics();

        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getSum());

        Set<Car> collect = IntStream.rangeClosed(0, 10)
                .mapToObj(s -> new Car("BRAND", s, "black"))
                .collect(Collectors.toSet());
    }

    private static void onlyOnce() {
        List<Car> cars = Arrays.asList(
                new Car("FORD", 200000, "red"),
                new Car("RENAULT", 150000, "blue"),
                new Car("BMW", 100000, "blue"),
                new Car("RENAULT", 90000, "green")
        );


        Supplier<Stream<Car>> supplier = () -> cars.stream().filter(s -> s.getBrand().equals("FORD"));

        supplier.get().forEach(s -> System.out.println(s));
        supplier.get().forEach(s -> System.out.println(s));
    }

    private static void joiningAndMap() {
        List<String> examples = new ArrayList<>(Arrays.asList("abcd", "cdea", "fsaa", "asds"));

        String collect = examples.stream().collect(Collectors.joining(", "));
        System.out.println(collect);

        List<Car> cars = Arrays.asList(
                new Car("FORD", 200000, "red"),
                new Car("RENAULT", 150000, "blue"),
                new Car("BMW", 100000, "blue"),
                new Car("RENAULT", 90000, "green")
        );

        Map<Integer, String> collect1 = cars.stream().collect(Collectors.toMap(s -> s.getSeries(), car -> car.getColor()));
    }

    private static void groupBy() {
        List<Car> cars = Arrays.asList(
                new Car("FORD", 200000, "red"),
                new Car("RENAULT", 150000, "blue"),
                new Car("BMW", 100000, "blue"),
                new Car("RENAULT", 90000, "green")
        );


        Map<String, Set<Car>> collect = cars.stream()
                .collect(Collectors.groupingBy(car -> car.getColor(), Collectors.toSet()));

        System.out.println(collect.get("blue"));
    }

    private static void terminal() {
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(1, 2, 3, 4));
        listOfLists.add(Arrays.asList(5, 6, 7, 8));

        Optional<Integer> min = listOfLists.stream()
                .flatMap(list -> list.stream())
                .max(Comparator.comparingInt(number -> number));

        System.out.println(min);
    }

    private static void peekSortDistinctLimit() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 7, 4, 5, 8, 6, 6, 7, 7);

        numbers.stream()
                .distinct()
                .sorted()
                .peek(System.out::println)
                .limit(4)
                .forEach(System.out::println);
    }

    private static void beginningLambda() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(BigDecimal::valueOf)
                .peek(System.out::println)
                .sequential()
                .sorted()
                .forEach(s -> System.out.println(s.multiply(BigDecimal.TEN)));
    }
}

