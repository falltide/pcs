package com.pcs.data.demo.controller;

import com.pcs.data.demo.entity.Major;
import com.pcs.data.demo.entity.MajorAndRequireAndPoint;
import com.pcs.data.demo.entity.Point;
import com.pcs.data.demo.entity.Require;
import com.pcs.data.demo.result.Result;
import com.pcs.data.demo.result.ResultFactory;
import com.pcs.data.demo.service.MajorService;
import com.pcs.data.demo.service.PointService;
import com.pcs.data.demo.service.RequireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MajorController {

    @Autowired
    MajorService MajorService;
    @Autowired
    RequireService requireService;
    @Autowired
    PointService pointService;


    public Result addOrUpdateMajor(@RequestBody @Valid Major major){
        if(major!=null) {
            MajorService.addOrUpdate(major);
            return ResultFactory.buildSuccessResult("修改成功");
        }else
            return ResultFactory.buildFailResult("无数据错误");
    }

    @GetMapping("/api/major")
    public Result listMajors(){
        return ResultFactory.buildSuccessResult(MajorService.listAllMajor());

    }

    @GetMapping("/api/addmajor")
    public Result addMajorAndRequireAndPoint(@RequestBody @Valid MajorAndRequireAndPoint majorAndRequireAndPoint){
        Major major = majorAndRequireAndPoint.getMajor();
        List<Require> Requires = majorAndRequireAndPoint.getRequire();
        List<Point> points = majorAndRequireAndPoint.getPoint();

        Result majorResult = addOrUpdateMajor(major);

        for (Require require : Requires) {
            requireService.addOrUpdate(require);
        }

        for (Point point : points){
            pointService.addOrUpdate(point);
        }
        if (majorResult.getCode()==400)
            return ResultFactory.buildFailResult("写入错误");

        return ResultFactory.buildSuccessResult("成功");
    }
}
