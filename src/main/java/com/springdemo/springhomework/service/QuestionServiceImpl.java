package com.springdemo.springhomework.service;

import com.springdemo.springhomework.dao.QuestionDao;
import com.springdemo.springhomework.domain.Question;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
    private final QuestionDao dao;

    public QuestionServiceImpl(QuestionDao dao) {
        this.dao = dao;
    }

    public Question getByText(String text) {
        return dao.showQuestion(text);
    }
}
