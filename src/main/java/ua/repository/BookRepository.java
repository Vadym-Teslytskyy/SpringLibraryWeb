package ua.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

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
     * Task 5
     */
    Book howManyTimesBookWasTakenAtAll(String bookName);
    /** 
     * Task 5
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
