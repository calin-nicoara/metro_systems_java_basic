package ro.cni.javabasicmetrosystems.prepared.day4.collections;

import java.util.ArrayList;
import java.util.List;

import ro.cni.javabasicmetrosystems.exercises.day2.exercise3.Car;

public class MainCollections {
    public static void main(String[] args) {
        rawCollections();
        genericList();
    }

    private static void genericList() {
        Car car = new Car("car", 200, 2, true);

        List<Car> carList = new ArrayList<Car>();
        carList.add(car);
        Car car0 = carList.get(0);
    }

    private static void rawCollections() {
        Car car = new Car("car", 200, 2, true);

        List carList = new ArrayList();
        carList.add(car);
        Car car0 = (Car) carList.get(0);

        Car[] carArray = new Car[3];
        carArray[0] = car;
        Car carArray0 = carArray[0];
    }
}
