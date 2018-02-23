package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ua.entity.Rent;


public interface RentRepository extends JpaRepository<Rent, Integer>{

}
