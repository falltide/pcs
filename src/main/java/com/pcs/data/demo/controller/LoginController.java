package com.pcs.data.demo.controller;


import com.pcs.data.demo.entity.Admin;
import com.pcs.data.demo.result.Result;
import com.pcs.data.demo.result.ResultFactory;
import com.pcs.data.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Autowired
    AdminService adminService;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody Admin requestAdmin, HttpSession session) {
        String admin_id = requestAdmin.getAdminId();
        admin_id= HtmlUtils.htmlEscape(admin_id);
        Admin admin = adminService.getByAdminID(admin_id);
        if(admin.getAdminPsw().equals(requestAdmin.getAdminPsw())){
            return ResultFactory.buildSuccessResult("登录成功");
        }else
            return ResultFactory.buildFailResult("密码或账号错误");
    }
}
