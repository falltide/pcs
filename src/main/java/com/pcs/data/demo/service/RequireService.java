package com.pcs.data.demo.service;

import com.pcs.data.demo.dao.RequireDAO;
import com.pcs.data.demo.entity.Require;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequireService {
    @Autowired
    RequireDAO requireDAO;
    public void addOrUpdate(Require require) {
        requireDAO.save(require);
    }

    public void deleteById(int id) {
        requireDAO.deleteById(id);
    }

    public List<Require> ListRequire(){
        return requireDAO.findAll();
    }
}
