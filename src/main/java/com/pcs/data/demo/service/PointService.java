package com.pcs.data.demo.service;


import com.pcs.data.demo.dao.PointDAO;
import com.pcs.data.demo.entity.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {

    @Autowired
    PointDAO pointDAO;
    public void addOrUpdate(Point point) {
        pointDAO.save(point);
    }

    public void deleteById(int id) {
        pointDAO.deleteById(id);
    }

    public List<Point> ListPoint(){
        return pointDAO.findAll();
    }
}
