package ro.cni.javabasicmetrosystems.exercises.day1.bookstore;

import java.util.Scanner;

public class BookstoreMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("How many books do you want in the store?");
        final int numberOfBooks = scanner.nextInt();
        scanner.nextLine();
        Book[] books = new Book[numberOfBooks];

        for(int i = 0; i < numberOfBooks; i++) {
            System.out.println("Title: ");
            final String title = scanner.nextLine();
            System.out.println("Author: ");
            final String author = scanner.nextLine();
            System.out.println("Publisher: ");
            final String publisher = scanner.nextLine();
            System.out.println("Page count: ");
            final int pageCount = scanner.nextInt();
            scanner.nextLine();

            books[i] = new Book(title, author, publisher, pageCount);
        }

        Bookstore bookstore = new Bookstore(books);

        System.out.println("Check duplicates");
        System.out.println(bookstore.checkForDuplicateBooks());

        System.out.println("Get largest book");
        System.out.println(bookstore.getLargestBook().getTitle());
    }
}
