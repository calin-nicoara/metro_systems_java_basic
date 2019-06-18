package ro.cni.javabasicmetrosystems.live.day3;

import java.io.*;

public class BufferedMain {
    static String pathToFiles = "/home/calin-nicoara/Projects" +
            "/courses/java_courses/metro_systems_java_basic" +
            "/files/";

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(pathToFiles + "text.txt"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToFiles + "text2.txt"));

        final PrintWriter printWriter = new PrintWriter(new FileWriter(pathToFiles + "text2.txt"));

        String line = null;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            printWriter.write(line);
        }

        bufferedReader.close();
        printWriter.close();
    }
}
