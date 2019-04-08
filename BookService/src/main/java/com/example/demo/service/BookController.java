package com.example.BookService.service;

import static com.example.BookService.util.SleepUtility.sleep;

import com.example.BookService.manager.BookManager;
import com.example.BookService.model.Book;
import com.example.BookService.util.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookManager bookManager;

    //@Autowired
    //Logger logger;

    @RequestMapping(value="/{author}/books", method= RequestMethod.GET)
    public List<Book> getBookByAuthor(@PathVariable(value="author") String author)
    {
        List<Book> books = bookManager.getByAuthor(author);
        //logger.logBooks(books);
        return books;
    }


}
