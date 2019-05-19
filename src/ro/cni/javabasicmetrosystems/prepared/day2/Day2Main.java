package ro.cni.javabasicmetrosystems.prepared.day2;

import ro.cni.javabasicmetrosystems.prepared.day2.oop_principles.CandyFactory;
import ro.cni.javabasicmetrosystems.prepared.day2.oop_principles.CarWithStatic;

public class Day2Main {
    public static void main(String[] args) {
//        TextBox textBox = new TextBox(100, 200, "It's my way or the Huawei!");
//
//        System.out.println(textBox.getArea());
//        System.out.println(textBox.text);

        final CandyFactory candyFactory = new CandyFactory(10);

        candyFactory.makeCandyAndEatIt();


        CarWithStatic carWithStatic = new CarWithStatic();
    }
}
