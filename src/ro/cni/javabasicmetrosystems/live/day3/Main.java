package ro.cni.javabasicmetrosystems.live.day3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car2 car = new Car2(123123, 3, 110);
        Car2 car2 = new Car2(123123, 4, 100);

        System.out.println(car == car2);
        System.out.println(car.equals(car2));

        Car2[] cars = {car, car2};

//        Arrays.sort(cars);

        Arrays.sort(cars, new Car2ComparatorNumberofWheels());

        System.out.println(Arrays.toString(cars));
    }
}
