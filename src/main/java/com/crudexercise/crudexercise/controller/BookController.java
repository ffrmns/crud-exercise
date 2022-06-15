package com.crudexercise.crudexercise.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.crudexercise.crudexercise.model.Book;
import com.crudexercise.crudexercise.service.BookService;

@RestController
public class BookController {
  @Autowired
  BookService bookService;

  @PostMapping("/book")
  private int saveBook(@RequestBody Book book) {
    bookService.saveBook(book);
    return book.getBookId();
  }

  @GetMapping("/book")
  private List<Book> getAllBooks() {
    return bookService.getAllBooks();
  }

  @GetMapping("/book/{bookId}")
  private Book getBookById(@PathVariable("bookId") int bookId) {
    return bookService.getBookById(bookId);
  }

  @PutMapping("/book/{bookId}")
  private Book updateBookById(@PathVariable("bookId") int bookId, @RequestBody Book book) {
    bookService.updateBookById(book, bookId);
    return book;
  }

  @DeleteMapping("/book/{bookId}")
  private void deleteBookById(@PathVariable("bookId") int bookId) {
    bookService.deleteBookById(bookId);
  }
}
