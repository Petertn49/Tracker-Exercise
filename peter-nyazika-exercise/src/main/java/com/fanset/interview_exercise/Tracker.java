package com.fanset.interview_exercise;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Tracker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label;
    private String deviceId;
    private LocalDateTime creationDate;
    private String model;



}