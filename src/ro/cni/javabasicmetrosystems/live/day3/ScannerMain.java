package ro.cni.javabasicmetrosystems.live.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {
    static String pathToFiles = "/home/calin-nicoara/Projects" +
            "/courses/java_courses/metro_systems_java_basic" +
            "/files/in.txt";

    public static void main(String[] args) throws FileNotFoundException {

        final Scanner scanner = new Scanner(new FileInputStream(pathToFiles));

        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextBoolean());
    }
}
