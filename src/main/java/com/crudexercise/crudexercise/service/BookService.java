package com.crudexercise.crudexercise.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crudexercise.crudexercise.model.Book;
import com.crudexercise.crudexercise.repository.BooksRepository;

@Service
public class BookService {
  @Autowired
  BooksRepository booksRepository;

  public void saveBook(Book book) {
    booksRepository.save(book);
  }

  public List<Book> getAllBooks() {
    List<Book> booksList = new ArrayList<Book>();
    booksRepository.findAll().forEach(eachBook -> booksList.add(eachBook));
    return booksList;
  }

  public Book getBookById(int bookId) {
    return booksRepository.findById(bookId).get();
  }

  public void updateBookById(Book book, int bookId) {
    booksRepository.save(book);
  }

  public void deleteBookById(int bookId) {
    booksRepository.deleteById(bookId);
  }
}
