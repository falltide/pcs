package com.pcs.data.demo.service;

import com.pcs.data.demo.dao.MajorDAO;
import com.pcs.data.demo.entity.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorService {
    @Autowired
    MajorDAO MajorDAO;

    public void addOrUpdate(Major major) {
        MajorDAO.save(major);
    }

    public void deleteById(int id) {
        MajorDAO.deleteById(id);
    }

    public List<Major> listMajorByMajorName(String major_name) {
        return MajorDAO.findAllByMajorName(major_name);
    }

    public List<Major> listAllMajor() {
        return MajorDAO.findAll();
    }
}
