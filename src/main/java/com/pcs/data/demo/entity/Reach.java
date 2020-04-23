package com.pcs.data.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "reach")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Reach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sbj_id")
    private int sbjId;

    private String sbjName;

    private float sbjGrade;

    private String sbjNtur;

    private float sbjHour;
}
