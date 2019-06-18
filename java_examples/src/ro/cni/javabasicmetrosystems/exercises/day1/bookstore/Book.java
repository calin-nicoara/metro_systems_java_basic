package ro.cni.javabasicmetrosystems.exercises.day1.bookstore;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pageCount;

    public Book(final String title, final String author, final String publisher, final int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPageCount() {
        return pageCount;
    }
}
