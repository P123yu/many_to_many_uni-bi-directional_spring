package com.many_to_many.controller;


import com.many_to_many.model.StudentModel;
import com.many_to_many.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentServiceImpl;

    //getAll
    @GetMapping("/getAll")
    public ResponseEntity<?>getAll(){
        List<StudentModel> student=studentServiceImpl.getAll();
        if(!student.isEmpty()){
            return ResponseEntity.ok(student);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found getAll");
        }
    }


    // create
    @PostMapping("/post")
    public ResponseEntity<?>create(@RequestBody  StudentModel studentModel){
        StudentModel student=studentServiceImpl.create(studentModel);
        if(student!=null){
            return ResponseEntity.ok(student);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not create");
        }
    }

    //getById
    @GetMapping("/getById/{id}")
    public ResponseEntity<?>getById(@PathVariable Long id){
        StudentModel student=studentServiceImpl.getById(id);
        if(student!=null){
            return ResponseEntity.ok(student);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not get by that id");
        }
    }


}
