package ro.cni.javabasicmetrosystems.prepared.day4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ro.cni.javabasicmetrosystems.exercises.day2.exercise3.Car;

public class MainGenerics {
    public static void main(String[] args) {
//        objectBox();
//        genericBox();
//        methodGeneric();
//        boundedTypeParameters();
        typeInference();

        List<EvenNumber> le = new ArrayList<>();
        List<? extends NaturalNumber> ln = le;

//        ln.add(new NaturalNumber(1));
    }

    private static void typeInference() {
        List<String> strings = Collections.emptyList();
        final List<String> strings1 = Collections.<String>emptyList();

        GenericTypeClass<Integer> al = new GenericTypeClass<>("");
    }

    private static void boundedTypeParameters() {
        NumberGenericBox<Number> numberGenericBox = new NumberGenericBox<>();
        numberGenericBox.setMyObject(20);
        System.out.println(numberGenericBox.getMyObject());

        //not possible
//        numberGenericBox = new NumberGenericBox<Integer>();
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
