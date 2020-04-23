package com.pcs.data.demo.dao;

import com.pcs.data.demo.entity.Major;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MajorDAO  extends JpaRepository<Major,Integer> {
    List<Major> findAllByMajorName(String name);
}
