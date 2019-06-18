package ro.cni.javabasicmetrosystems.live.day3;

import java.io.IOException;
import java.nio.file.*;

public class NIOMain {
    static String pathToFiles = "/home/calin-nicoara/Projects" +
            "/courses/java_courses/metro_systems_java_basic" +
            "/files/";

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(pathToFiles);

        final Path filePath = Paths.get(path.toString(), "niotest.txt");
        final Path pathDEstination = Paths.get(path.toString(), "destination.txt");
//        Files.createFile(filePath);

//        Files.write(filePath, "Salut".getBytes(), StandardOpenOption.APPEND);

        Files.copy(filePath, pathDEstination, StandardCopyOption.REPLACE_EXISTING);

//        List strings = Files.readAllLines(Paths.get(pathToFiles, "text.txt"));

//        System.out.println(strings);

        System.out.println(Files.isDirectory(Paths.get(pathToFiles)));


    }
}
