package com.many_to_many.service;


import com.many_to_many.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    // getAll
    List<StudentModel>getAll();

    // create
    StudentModel create(StudentModel studentModel);

    // getById
    StudentModel getById(Long id);

}
