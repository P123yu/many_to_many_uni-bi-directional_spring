package com.many_to_many.serviceImpl;

import com.many_to_many.model.StudentModel;
import com.many_to_many.repository.StudentRepository;
import com.many_to_many.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<StudentModel> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentModel create(StudentModel studentModel) {
        return studentRepository.save(studentModel);
    }

    @Override
    public StudentModel getById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}
