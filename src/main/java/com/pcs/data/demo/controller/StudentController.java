package com.pcs.data.demo.controller;


import com.pcs.data.demo.entity.Student;
import com.pcs.data.demo.result.Result;
import com.pcs.data.demo.result.ResultFactory;
import com.pcs.data.demo.service.StudentService;
import com.pcs.data.demo.service.xlsxFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    xlsxFileService xlsxFileService;

    public Result addStudent(HttpServletRequest request) throws Exception {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("filename");
        if (null == file) {
            return ResultFactory.buildFailResult("上传失败，无法找到文件！");
        }

        InputStream inputStream = file.getInputStream();
        List<List<Student>> list = xlsxFileService.getBankListByExcel(inputStream, file.getOriginalFilename());
        inputStream.close();

        for (int i = 0; i < list.size(); i++) {
            List<Student> Students= list.get(i);
            for (Student student:Students) {
                studentService.addOrUpdate(student);
            }
        }
        return ResultFactory.buildSuccessResult("处理成功");
    }

}
