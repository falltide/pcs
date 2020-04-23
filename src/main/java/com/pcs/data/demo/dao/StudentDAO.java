package com.pcs.data.demo.dao;

import com.pcs.data.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student,Integer> {


}
