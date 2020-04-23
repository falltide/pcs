package com.pcs.data.demo.dao;

import com.pcs.data.demo.entity.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointDAO extends JpaRepository<Point,Integer> {
}
