package com.springdemo.springhomework.service;

import com.springdemo.springhomework.domain.CsvLine;

import java.util.List;

public interface CsvLineService {
    List<CsvLine> getQuestionsAndAnswers();
    void showQuestionsAndAnswers();
}
