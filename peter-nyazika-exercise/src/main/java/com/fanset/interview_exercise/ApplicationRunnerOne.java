package com.fanset.interview_exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApplicationRunnerOne {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunnerOne.class, args);
    }
}
