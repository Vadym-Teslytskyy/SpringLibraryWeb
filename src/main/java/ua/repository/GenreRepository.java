package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ua.entity.Genre;


public interface GenreRepository extends JpaRepository<Genre, Integer>{

}
