package com.pcs.data.demo.dao;

import com.pcs.data.demo.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectDAO  extends JpaRepository<Subject,Integer> {
}
