package ro.cni.javabasicmetrosystems.prepared.day3.io;

import java.io.IOException;
import java.nio.file.*;

public class PathMain {
    static final String dataPath = "/home/calin-nicoara/Projects/courses/java_courses" +
            "/metro_systems_java_basic/files/invoicedata";

    static final String folderPath = "/home/calin-nicoara/Projects/courses/java_courses" +
            "/metro_systems_java_basic/files";

    public static void main(String[] args) throws IOException {
//        final Path path = Paths.get(dataPath);
//
//        System.out.println(path.isAbsolute());
//
//        System.out.println(Files.isDirectory(path));

        directoryActions();

    }

    public static void directoryActions() throws IOException {
        final Path path = Paths.get(folderPath);
//
//        Files.createDirectory(Paths.get(folderPath, "test_create"));
//
//        Files.createDirectories(Paths.get(folderPath + "/test1/test2/test3"));

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path file: stream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException x) {
            // IOException can never be thrown by the iteration.
            // In this snippet, it can only be thrown by newDirectoryStream.
            System.err.println(x);
        }
    }
}
