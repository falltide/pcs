package com.pcs.data.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "teacher")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tch_id")
    private String tchId;

    private String tchJob;

    private Date tchBron;

    private String tchSch;

    private String tchName;

    @ManyToOne
    @JoinColumn(name="tch_sbj")
    private Subject subject;

}
