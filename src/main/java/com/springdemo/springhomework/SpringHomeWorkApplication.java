package com.springdemo.springhomework;

import com.springdemo.springhomework.service.CsvLineService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringHomeWorkApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringHomeWorkApplication.class);
        CsvLineService service = context.getBean(CsvLineService.class);

        service.showQuestionsAndAnswers();
    }
}
