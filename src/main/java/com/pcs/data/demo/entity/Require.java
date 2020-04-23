package com.pcs.data.demo.entity;

//毕业要求实体类

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "require")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Require {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "require_id")
    private int requireId;

    private String requireName;

    @ManyToOne
    @JoinColumn(name="major_id")
    private Major major;

    private int grade;

    private String requireNote;

}
