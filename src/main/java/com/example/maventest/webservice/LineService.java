package com.example.maventest.webservice;

import com.example.maventest.model.Line;

import java.io.IOException;
import java.util.List;

public interface LineService {
    List<Line> readJsonLines() throws IOException;
    Line getLineById(Long id) throws IOException;
    List<Line> getAllLines() throws IOException;
    Line addLine(Line item);
    Line updateLine(Line item);
    void deleteLine(Long id);
}
