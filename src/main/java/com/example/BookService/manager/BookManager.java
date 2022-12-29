package com.example.BookService.manager;

import java.util.ArrayList;
import java.util.List;

import com.example.BookService.model.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import static com.example.BookService.util.SleepUtility.sleep;

@Component
public class BookManager {

    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("Sam", "Sam-1"));
        books.add(new Book("Sam", "Sam-2"));

        books.add(new Book("Ajax", "Ajax-1"));

        books.add(new Book("Steve", "Steve-1"));

    }

    @Cacheable("BookList")
    public List<Book> getByAuthor(String pAuthor) {
        //sleep(8);
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book b : books) {
            if (pAuthor.equalsIgnoreCase(b.getAuthor())) {
                booksByAuthor.add(b);
            }
        }

        return booksByAuthor;
    }


}
