package ro.cni.javabasicmetrosystems.exercises;

import java.util.Scanner;

public class ExerciseTwo {

    public static void exerciseOne(int[][] matrix, int n) {
        System.out.println();
        printMatrix(matrix, n);
        System.out.println();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j != i) {
                    matrix[i][j] = 0;
                }
            }
        }

        printMatrix(matrix, n);
    }

    public static void exerciseTwo() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("What is the dimension of your matrix?");
        final int size = scanner.nextInt();

        int[][] numbers = new int[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Here is your matrix");
        printMatrix(numbers, size);
    }

    private static void printMatrix(final int[][] matrix, final int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print( matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
