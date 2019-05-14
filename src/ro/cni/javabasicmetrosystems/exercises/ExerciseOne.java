package ro.cni.javabasicmetrosystems.exercises;

public class ExerciseOne {
    public static void exerciseOne() {
        System.out.println("Exercise 1");

        String string = "I like the movie Triple X with Vin Diesel";

        System.out.println(string.indexOf("X"));
    }

    public static void exerciseTwo() {
        System.out.println("Exercise 2");

        float firstNumber = 20.0f;
        int secondNumber = 15;

        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber - secondNumber);

        System.out.println();
    }

    public static void exerciseThree() {
        System.out.println("Exercise 3");


        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println();
    }

    public static void exerciseFour(int i) {
        System.out.println("Exercise 4");

        if (i < 25 && i % 2 != 0) {
            System.out.println(i);
        }

        System.out.println();
    }

    public static void exerciseFive(int x, int y) {
        System.out.println("Exercise 4");

        int counter = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                if (++counter == 4) {
                    break;
                }
            }
        }

        System.out.println();
    }

    public static void exerciseFiveV2(int x, int y) {
        System.out.println("Exercise 4");

        for (int i = x + x % 2; i <= y && i < (x + x % 2) + 8; i = i + 2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
