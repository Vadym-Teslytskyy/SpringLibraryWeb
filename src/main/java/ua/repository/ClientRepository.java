package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Book;
import ua.entity.Client;

import java.time.LocalDate;

public interface ClientRepository extends JpaRepository<Client, Integer>{

    LocalDate howMuchTimeTheClientUseTheLibrary(String login);

    Book whichBooksClientDidntReturn(String login);

    Book whichBookDidTakeTheClient(String login);

}
