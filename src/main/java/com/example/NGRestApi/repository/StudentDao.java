package com.example.NGRestApi.repository;

import com.example.NGRestApi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
