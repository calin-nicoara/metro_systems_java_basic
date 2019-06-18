package ro.cni.javabasicmetrosystems.live.day3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoMain {
    public static void main(String[] args) {
        String pathToFiles = "/home/calin-nicoara/Projects" +
                "/courses/java_courses/metro_systems_java_basic" +
                "/files/";


        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(pathToFiles + "in.txt");
            fileOutputStream = new FileOutputStream(pathToFiles + "out.txt");


            int c;
            while((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
