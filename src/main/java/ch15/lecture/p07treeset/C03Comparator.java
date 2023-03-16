package ch15.lecture.p07treeset;

import java.util.Objects;
import java.util.TreeSet;

public class C03Comparator {
    public static void main(String[] args) {
        TreeSet<Book> set = new TreeSet<>((a, b)-> a.getTitle().compareTo(b.getTitle()));
        set.add(new Book("slamdunk"));
        set.add(new Book("avatar"));
        set.add(new Book("glory"));
        set.add(new Book("slamdunk"));
        System.out.println(set);
    }
}
class Book{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}