package ch15.lecture.p03set;

import java.util.HashSet;
import java.util.Objects;

public class C05Contains {
    public static void main(String[] args) {
        var set = new HashSet<Book>();
        set.add(new Book("slamdunk"));
        set.add(new Book("avatar"));
        set.add(new Book("topgun"));
        set.add(new Book("slamdunk")); // 안 들어감


        System.out.println(set.size());

        System.out.println(set.contains(new Book("avatar")));
    }
}

class Book {
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