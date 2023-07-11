package com.springdemo.springhomework.dao;

import com.springdemo.springhomework.domain.Question;
import org.springframework.stereotype.Component;

@Component
public class QuestionDaoImpl implements QuestionDao {

    public Question showQuestion(String text) {
        return new Question(text);
    }
}
