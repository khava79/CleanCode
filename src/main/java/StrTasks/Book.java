package StrTasks;
import java.util.Objects;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return Objects.equals(title, b.title) &&
                Objects.equals(author, b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}