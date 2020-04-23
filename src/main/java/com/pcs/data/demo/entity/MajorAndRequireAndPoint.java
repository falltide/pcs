package com.pcs.data.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Data
//@Entity
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class MajorAndRequireAndPoint {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Major major;

    private List<Require> require;

    private List<Point> point;
}
