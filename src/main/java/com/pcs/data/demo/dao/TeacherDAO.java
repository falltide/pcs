package com.pcs.data.demo.dao;

import com.pcs.data.demo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherDAO extends JpaRepository<Teacher,Integer> {
}
