package com.pcs.data.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "studentscore")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class StudentScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private int stuId;

    @ManyToOne
    @JoinColumn(name="class_id")
    private Class aClass;

    private float score;

}
