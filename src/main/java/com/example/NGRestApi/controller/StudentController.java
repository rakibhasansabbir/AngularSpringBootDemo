package com.example.NGRestApi.controller;

import com.example.NGRestApi.model.Student;
import com.example.NGRestApi.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/students")
    private List<Student> getAll(){
        return studentDao.findAll();
    }

    @GetMapping("/student/{id}")
    private Optional<Student> getOne(@PathVariable int id){
        return studentDao.findById(id);
    }

    @DeleteMapping("/student/{id}")
    private boolean getAll(@PathVariable int id){

        studentDao.delete(studentDao.getOne(id));
        return true;
    }

    @PutMapping("/student")
    private Student updateStudent(Student student){

        return studentDao.save(student);
    }

    @PostMapping("/student")
    private Student createUser(Student student){

        return studentDao.save(student);
    }
}
