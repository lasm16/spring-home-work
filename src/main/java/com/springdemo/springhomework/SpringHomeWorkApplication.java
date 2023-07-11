package com.springdemo.springhomework;

import com.springdemo.springhomework.domain.Question;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
@Configuration
public class SpringHomeWorkApplication {
    private static final String COMMA_DELIMITER = ",";
    private static final String resourceName = "questions.csv";

    public static void main(String[] args) {
        SpringApplication.run(SpringHomeWorkApplication.class, args);

        var questions = new ArrayList<Question>();
        var resource = SpringHomeWorkApplication.class.getClassLoader().getResourceAsStream(resourceName);
        try (Scanner rowScanner = new Scanner(resource)) {
            rowScanner.useDelimiter(COMMA_DELIMITER);
            while (rowScanner.hasNext()) {
                questions.add(new Question(rowScanner.next()));
            }
        }
        questions.forEach(x -> System.out.println(x.getText()));
    }
}
