package ro.cni.javabasicmetrosystems.prepared.day2.oop_principles;

public class CarWithStatic {
    static int numberOfCars = 0;

    public CarWithStatic() {
        numberOfCars++;
    }

    static void showNumberOfCars() {
        System.out.println(numberOfCars);
    }

    public static void main(String[] args) {
        CarWithStatic carWithStatic1 = new CarWithStatic();

        CarWithStatic.showNumberOfCars();

        CarWithStatic carWithStatic2 = new CarWithStatic();

        CarWithStatic.showNumberOfCars();
    }
}
