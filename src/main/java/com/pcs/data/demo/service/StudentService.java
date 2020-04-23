package com.pcs.data.demo.service;

import com.pcs.data.demo.dao.StudentDAO;
import com.pcs.data.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDAO studentDAO;

    public void addOrUpdate(Student student) {
        studentDAO.save(student);
    }

    public void deleteById(int id) {
        studentDAO.deleteById(id);
    }

    public List<Student> ListStudent(){
        return studentDAO.findAll();
    }
}
