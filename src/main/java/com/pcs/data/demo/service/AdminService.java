package com.pcs.data.demo.service;

import com.pcs.data.demo.dao.AdminDAO;
import com.pcs.data.demo.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminDAO AdminDAO;

    public boolean isExist(String adminId) {
        Admin Admin = getByAdminID(adminId);
        return null!= Admin;
    }

    public Admin getByAdminID(String adminId) {
        return AdminDAO.findByAdminId(adminId);
    }

    public Admin get(String adminId, String adminPsw){
        return AdminDAO.getByAdminIdAndAdminPsw(adminId, adminPsw);
    }

    public void add(Admin Admin) {
        AdminDAO.save(Admin);
    }
}
