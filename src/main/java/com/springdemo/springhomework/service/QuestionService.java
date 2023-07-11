package com.springdemo.springhomework.service;

import com.springdemo.springhomework.domain.Question;

public interface QuestionService {
    Question getByText(String text);
}
