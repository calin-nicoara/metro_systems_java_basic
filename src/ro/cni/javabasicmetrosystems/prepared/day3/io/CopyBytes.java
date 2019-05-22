package ro.cni.javabasicmetrosystems.prepared.day3.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        String pathToFiles = "/home/calin-nicoara/Projects/courses/java_courses/metro_systems_java_basic/files";

        try {
            in = new FileInputStream(pathToFiles + "/in.txt");
            out = new FileOutputStream(pathToFiles + "/out.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
