package com.crudexercise.crudexercise.repository;
import org.springframework.data.repository.CrudRepository;
import com.crudexercise.crudexercise.model.Book;

public interface BooksRepository extends CrudRepository<Book, Integer> {
}
