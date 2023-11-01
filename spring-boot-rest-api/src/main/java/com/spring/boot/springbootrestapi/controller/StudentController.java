package com.spring.boot.springbootrestapi.controller;

import com.spring.boot.springbootrestapi.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(121, "Harsha Vardhan", "Bashavathini");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(213, "Micheal", "Scott"));
        students.add(new Student(314, "Dwight", "Schrute"));
        students.add(new Student(653, "Jim", "Halpert"));
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/students/{id}/{fname}")
    public ResponseEntity<Student> getStudentByFirstName(@PathVariable int id, @PathVariable String fname){
        Student student = new Student(id, fname, "Beesly");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/students/query")
    public ResponseEntity<Student> getStudentByIdAndFirstName(@RequestParam int id, @RequestParam String fname){
        Student student = new Student(id, fname, "Beesly");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/student/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping("/student/update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable int id){
        student.setId(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping("/student/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
        System.out.println("Deleted Student ID: " + id);
        return new ResponseEntity<>("Successfully deleted !!", HttpStatus.OK);
    }
}
