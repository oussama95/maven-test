package com.example.maventest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor
public class Line {
    private Long id;
    private String label;
    private Date date;
}
