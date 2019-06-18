package ro.cni.javabasicmetrosystems.live.day3;

import java.io.IOException;

public class MainExceptions {

    public static void main(String[] args) {
//        checkedException();
//        try {
//            throw new RuntimeException("runtime exception");
////        } catch (RuntimeException ex) {
////            System.out.println(ex.getMessage());
//        } finally {
//            System.out.println("Finally!");
//        }
//        methodThatThrowsException();

//        multipleCAtch();

    }

    private static void multipleCAtch() {
        boolean throwIO = false;
        boolean throwClassNotFound = true;
        try {
            if (throwIO) throw new IOException("IO");
            if(throwClassNotFound) throw new ClassNotFoundException("Class");

        } catch (IOException | ClassNotFoundException io) {
            System.out.println(io.getMessage());
        } catch (Exception io) {
            System.out.println("this is generic " + io.getMessage());
        }
    }

    private static void checkedException() {
        try {
            System.out.println("Trying to work");
            throw new Exception("Something failed");
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void methodThatThrowsException() throws Exception {
        System.out.println("Method that throws");
        throw new Exception();
    }
}
