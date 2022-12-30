package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Book;

@Repository
public interface Bookrepository extends JpaRepository<Book, Integer>{


}
