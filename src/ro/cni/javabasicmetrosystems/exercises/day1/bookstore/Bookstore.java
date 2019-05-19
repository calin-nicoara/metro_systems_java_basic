package ro.cni.javabasicmetrosystems.exercises.day1.bookstore;

public class Bookstore {
    private Book[] books;

    public Bookstore(Book[] books) {
        this.books = books;
    }

    public boolean checkForDuplicateBooks() {
        for(int i = 0; i < books.length; i++) {
            for(int j = i+1; j < books.length; j++) {
                if(books[i].getTitle().equals(books[j].getTitle())) {
                    return true;
                }
            }
        }

        return false;
    }

    public Book getLargestBook() {
        if(books == null || books.length == 0) {
            return null;
        }

        Book largestBook = books[0];

        for(int i = 1; i < books.length; i++) {
            if(books[i].getPageCount() > largestBook.getPageCount()) {
                largestBook = books[i];
            }
        }

        return largestBook;
    }
}
