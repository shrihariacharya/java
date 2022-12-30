package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;

@Repository
public interface Studentrepositori extends JpaRepository<Student, Integer>{


}
