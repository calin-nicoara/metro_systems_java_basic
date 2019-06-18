package ro.cni.javabasicmetrosystems.prepared.day3.io;

import java.io.*;

public class ObjectOutputStreamEx {
    static final String dataFile = "/home/calin-nicoara/Projects/courses/java_courses" +
            "/metro_systems_java_basic/files/client_stream";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObjects();
        readObject();
    }

    private static void writeObjects() throws IOException {
        Client client = new Client();
        client.setName("Test");

        final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(
                new FileOutputStream(dataFile)));

        objectOutputStream.writeObject(client);
        objectOutputStream.close();
    }

    private static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new
                BufferedInputStream(new FileInputStream(dataFile)));

        final Object o = in.readObject();
        System.out.println(o);
    }
}
