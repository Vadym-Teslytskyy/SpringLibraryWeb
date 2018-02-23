package ua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.entity.Author;

@Service
@Transactional
public class AuthorService {

    @Autowired
    AuthorService authorService;


}
