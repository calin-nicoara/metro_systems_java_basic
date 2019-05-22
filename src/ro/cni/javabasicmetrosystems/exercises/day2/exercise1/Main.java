package ro.cni.javabasicmetrosystems.exercises.day2.exercise1;

public class Main {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(3 , 4);
        MyPoint myPoint2 = new MyPoint(4 ,5);

        System.out.println(myPoint.distance());
        System.out.println(myPoint.distance(0, 0));
    }
}
