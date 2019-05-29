package ro.cni.javabasicmetrosystems.prepared.day4.generics;

import ro.cni.javabasicmetrosystems.exercises.day2.exercise3.Car;

public class MainGenerics {
    public static void main(String[] args) {
//        objectBox();
//        genericBox();
//        methodGeneric();
    }

    private static void methodGeneric() {
        Car car = new Car("car", 200, 2, true);
        final String enhancedString = GenericMethodBox.getEnhancedString(car);

        System.out.println(enhancedString);
    }

    private static void genericBox() {
        GenericBox<String> stringGenericBox = new GenericBox<>();

        stringGenericBox.setMyObject("Hello!");

        String myString = stringGenericBox.getMyObject();

        System.out.println(myString);
    }

    private static void objectBox() {
        ObjectBox objectBox = new ObjectBox();

        objectBox.setMyObject("My Object");

        System.out.println(objectBox.getMyObject());
    }
}
