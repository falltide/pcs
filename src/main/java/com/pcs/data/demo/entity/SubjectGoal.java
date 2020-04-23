package com.pcs.data.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "goal")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class SubjectGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goal_id")
    private int goalID;

    private String goalNote;

    @ManyToOne
    @JoinColumn(name="sbj_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name="point_id")
    private Point point;

    private String goalName;

}
