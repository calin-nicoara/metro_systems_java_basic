package ro.cni.javabasicmetrosystems.prepared.day3.io;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        String pathToFiles = "/home/calin-nicoara/Projects/courses/java_courses/metro_systems_java_basic/files";

        try {
            inputStream = new BufferedReader(new FileReader(pathToFiles + "/text.txt"));
            outputStream = new PrintWriter(new FileWriter(pathToFiles + "/out_text.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                System.out.println(l);
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
