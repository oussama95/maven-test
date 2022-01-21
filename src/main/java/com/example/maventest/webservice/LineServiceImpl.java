package com.example.maventest.webservice;

import com.example.maventest.model.Line;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class LineServiceImpl implements LineService{
    List<Line> lines = new ArrayList<>();

    public LineServiceImpl() {
        try {
            this.lines = this.readJsonLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Line> readJsonLines() throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File("./src/main/resources/lines"),
                new TypeReference<List<Line>>(){});
    }
    @Override
    public Line getLineById(Long id) throws IOException {
        return null;
    }

    @Override
    public List<Line> getAllLines() throws IOException {
        return lines;
    }

    @Override
    public Line addLine(Line item) {
        return null;
    }

    @Override
    public Line updateLine(Line item) {
        return null;
    }

    @Override
    public void deleteLine(Long id) {

    }
}
