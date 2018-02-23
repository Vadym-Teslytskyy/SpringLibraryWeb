package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ua.entity.Author;


public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
