package com.springdemo.springhomework.dao;

import com.springdemo.springhomework.domain.CsvLine;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Component
public class CsvLineDaoImpl implements CsvLineDao {

    private final String COMMA_DELIMITER = ",";
    private final String resourceName = "questions.csv";

    public List<CsvLine> getCsvLines() {
        var questions = new ArrayList<CsvLine>();
        var resource = this.getClass().getClassLoader().getResourceAsStream(resourceName);
        try (Scanner rowScanner = new Scanner(resource)) {
            while (rowScanner.hasNextLine()) {
                var line = Arrays.asList(rowScanner.nextLine().split(COMMA_DELIMITER));
                var answers = line.stream().skip(1).toList();
                var question = line.get(0);
                questions.add(new CsvLine(question, answers));
            }
        }
        return questions;
    }
}
