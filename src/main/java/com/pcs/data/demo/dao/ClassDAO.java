package com.pcs.data.demo.dao;

import com.pcs.data.demo.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassDAO extends JpaRepository<Class,Integer> {

}
