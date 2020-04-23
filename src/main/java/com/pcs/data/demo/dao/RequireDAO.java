package com.pcs.data.demo.dao;

import com.pcs.data.demo.entity.Require;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequireDAO extends JpaRepository<Require,Integer> {

    Require findByMajor(int id);

}
