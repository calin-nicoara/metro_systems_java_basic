package ro.cni.javabasicmetrosystems.day3.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class MainException {

    public static void main(String[] args)
//            throws IOException //needed for unhandled exception
    {
//        1. First exception
//        firstException();

//        2. Checked exception
//        checkedException(false);

//        3. Checked exception not handled
//        checkedExceptionNotHandled();

//        4. Unchecked exceptions (runtime)
//        uncheckedExceptions();

//        5. Errors (Never catch them!!)
//        throwError();

//        6. A more complex try catch
//        aComplexTryCatch(true, "java.lang.String");

//        7. Custom exceptions
//        customExceptions();
    }

    private static void firstException() {
        int[] arr = new int[4];

        System.out.println(arr[4]);
    }

    private static void checkedException(final boolean hasResource) {
        try {
            if(!hasResource) {
                throw new IOException();
            }
        } catch (IOException ie) {
            System.out.println("This is the error: " + ie);
        }
    }

    private static void checkedExceptionNotHandled() throws IOException{
        throw new IOException();
    }

    private static void uncheckedExceptions() {
        // RuntimeExceptions are the only Exceptions not checked
        throw new RuntimeException();
    }

    private static void throwError() {
        // NEVER, EVER CATCH AND ERROR!!!!!!
        try {
            throw new StackOverflowError();
        } catch(StackOverflowError soe) {
            System.out.println("Bad move!");
        }
    }

    private static void aComplexTryCatch(final boolean hasResource, final String checkedException) {
        try {
            if(!hasResource) {
                throw new IOException();
            }

            Class.forName(checkedException);

            throw new SQLException("No database here!");

        } catch (IOException | SQLException ie) {
            System.out.println("This is the error: " + ie.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally always happens");
        }
    }

    private static void customExceptions() {
        try {
            throw new OurOwnCheckedException();
        } catch (OurOwnCheckedException e) {
            e.printStackTrace();
            throw new OurOwnRuntimeException(e);
        }
    }
}
