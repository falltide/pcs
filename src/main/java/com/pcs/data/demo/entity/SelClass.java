package com.pcs.data.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "selclass")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class SelClass {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private String student;

    @ManyToOne
    @JoinColumn(name="class_id")
    private Class aClass;

    private String selNote;


}
