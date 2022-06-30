package com.belet.springsecuritydemo.student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Student {
    private final Integer studentId;
    private final String studentName;
}
