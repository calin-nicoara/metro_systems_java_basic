package ro.cni.javabasicmetrosystems.prepared.day4.collections;

import java.util.*;

import ro.cni.javabasicmetrosystems.exercises.day2.exercise3.Car;

public class MainCollections {
    public static void main(String[] args) {
//        rawCollections();
//        genericList();
//        iterator();
        collectionMethods();
    }

    private static void collectionMethods() {
        Collection<Integer> stringCollection = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        stringCollection.add(10);
        System.out.println(stringCollection);
        System.out.println(stringCollection.isEmpty());

        System.out.println(stringCollection.contains(3));
        System.out.println(stringCollection.contains(5));

        stringCollection.remove(3);
        System.out.println(stringCollection);


        stringCollection.addAll(Arrays.asList(5, 6));
        System.out.println(stringCollection);

        stringCollection.removeAll(Arrays.asList(2));
        System.out.println(stringCollection);

        stringCollection.retainAll(Arrays.asList(1, 3, 8, 9, 10));
        System.out.println(stringCollection);

        stringCollection.remove(10);
        System.out.println(stringCollection);

        stringCollection.clear();
        System.out.println(stringCollection);
    }

    private static void iterator() {
        Collection<String> list = new ArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String next = iterator.next();

            if("One".equalsIgnoreCase(next)) {
                iterator.remove();
            }
            System.out.println(next);
        }

        System.out.println(list);

        // Must implement Iterable
        for(Object item: list) {
            System.out.println(item);
        }
    }

    private static void genericList() {
        Car car = new Car("car", 200, 2, true);

        List<Car> carList = new ArrayList<>();
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
