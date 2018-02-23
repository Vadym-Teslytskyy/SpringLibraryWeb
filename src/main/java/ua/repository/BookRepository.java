package ua.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ua.entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer>{
    /** 
     * Task 1
      */
    Book isAvalibleBookByName(String bookName);
    /** 
     * Task 2
      */
    List<Book> findBooksByMainAuthor(String firstName , String lastName);
    /** 
     * Task 2
      */
    List<Book> findBooksByCoAuthor(String firstName , String lastName);
    /** 
      * Task 4
      */
    List<Book> findBooksRealesedDuringIndependencyPeriod();
    /** 
     * Task 5.1
     */
    Book howManyTimesBookWasTakenAtAll(String bookName);
    /**
     * Task 5.2
     */
    Book howManyTimesBooksCopyWasTaken(String bookName);
    /** 
     * Task 5.3
     */
    Book averageBooksTimeReading(String bookName);
    /** 
     * Task 6
     */
    List<Book> findBestFiveBooksDuringPeriod(int periodInDays);
    /** 
     * Task 6
     */
    List<Book> findWorstFiveBooksDuringPeriod(int periodInDays);








}
