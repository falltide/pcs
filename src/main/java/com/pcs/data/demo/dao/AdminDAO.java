package com.pcs.data.demo.dao;

import com.pcs.data.demo.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminDAO extends JpaRepository<Admin,Integer> {

    Admin findByAdminId(String adminId);
    Admin getByAdminIdAndAdminPsw(String adminId,String adminPsw);
}
