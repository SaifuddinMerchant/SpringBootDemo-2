package com.example.BookService.util;

import com.example.BookService.model.Book;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Logger {

    @Async
    public void logBooks(List<Book> pBooks)
    {
        SleepUtility.sleep(5);
        for(Book book : pBooks)
        {
            System.out.println(book);
        }
    }


}
