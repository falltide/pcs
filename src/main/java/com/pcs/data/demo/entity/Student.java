package com.pcs.data.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private int stuId;

    private String stuName;

    @ManyToOne
    @JoinColumn(name="major_id")
    private Major major;

    private int grade;

    private String gradeName;

    private int gradeId;

    private String stuPsw;


}
