package ua.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
    
    Book isAvalibleBookByName(String bookName);
    
    List<Book> findBooksByMainAuthor(String firstName , String lastName);
    
    List<Book> findBooksByCoAuthor(String firstName , String lastName);
    
    List<Book> findBooksRealesedDuringIndependencyPeriod();
    
    Book howManyTimesBookWasTakenAtAll(String bookName);
    
    Book averageBooksTimeReading(String bookName);








}
