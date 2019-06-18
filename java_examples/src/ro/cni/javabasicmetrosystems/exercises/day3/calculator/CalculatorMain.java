package ro.cni.javabasicmetrosystems.exercises.day3.calculator;

import java.util.Scanner;

class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");
        System.out.println("Please insert an expression:");

        Calculator calculator = new AdvancedCalculator();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String expresion = scanner.nextLine();

            if(expresion.toLowerCase().contains("quit")) {
                break;
            } else {
                try {
                    String[] values = expresion.split(" ");
                    String result = calculator.calculate(values);
                    System.out.println(result);
                } catch (Exception ex) {
                    System.err.println(String.format("Oops! There was an error: \r\n%s \r\nPlease try again", ex.getMessage()));
                }
            }
        }

        System.out.println("Thank you for using the calculator");
    }
}
