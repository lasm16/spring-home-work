package com.springdemo.springhomework.domain;

import java.util.List;

public class CsvLine {

    private final String question;
    private final List<String> answersList;

    public CsvLine(String question, List<String> answersList) {
        this.question = question;
        this.answersList = answersList;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswersList() {
        return answersList;
    }
}
