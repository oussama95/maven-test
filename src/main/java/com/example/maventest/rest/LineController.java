package com.example.maventest.rest;

import com.example.maventest.model.Line;
import com.example.maventest.webservice.LineService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@RestController
public class LineController {
    private final LineService lineService;

    @GetMapping("/lines")
    public List<Line> getLines() throws IOException {
        return lineService.getAllLines();
    }


}
