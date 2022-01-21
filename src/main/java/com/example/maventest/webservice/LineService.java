package com.example.maventest.webservice;

import com.example.maventest.model.Line;

import java.io.IOException;
import java.util.List;

public interface LineService {
    List<Line> readJsonLines() throws IOException;
    List<Line> getAllLines() throws IOException;
    Line addLine(Line line);
    Line updateLine(Line line,String label);
    void deleteLine(Long id);
}
