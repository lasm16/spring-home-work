package com.springdemo.springhomework;

import com.springdemo.springhomework.service.CsvLineService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class SpringHomeWorkApplicationTests {

    @Autowired
    private CsvLineService questionService;

    @Test
    void shouldReturnQuestion() {
        var questionExp = "Когда была выпущена первая компьютерная игра?";

        var service = questionService.getQuestionsAndAnswers();
        var questionAct = service.get(0).getQuestion();

        assertEquals(questionExp, questionAct);
    }

    @Test
    void shouldReturnAnswers() {
        var answersExp = Arrays.asList("1975", "2001", "1958", "1999");

        var service = questionService.getQuestionsAndAnswers();
        var answersAct = service.get(0).getAnswersList();

        assertEquals(answersExp, answersAct);
    }
}
