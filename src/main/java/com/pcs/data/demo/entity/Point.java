package com.pcs.data.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "point")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_id")
    private int pointId;

    @ManyToOne
    @JoinColumn(name="require_id")
    private Require require;

    private String pointNote;




}
