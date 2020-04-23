package com.pcs.data.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "class")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private String classId;//课号

    @ManyToOne
    @JoinColumn(name="tch_id")
    private Teacher teacher;//开课教师

    @ManyToOne
    @JoinColumn(name="sbj_id")
    private Subject subject;//课程代码

    private float classPoint;//课程达成度


}
