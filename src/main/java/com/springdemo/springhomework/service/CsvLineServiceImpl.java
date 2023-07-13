package com.springdemo.springhomework.service;

import com.springdemo.springhomework.dao.CsvLineDao;
import com.springdemo.springhomework.domain.CsvLine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CsvLineServiceImpl implements CsvLineService {
    private final CsvLineDao dao;

    public CsvLineServiceImpl(CsvLineDao dao) {
        this.dao = dao;
    }

    public List<CsvLine> showQuestionsAndAnswers() {
        return dao.getCsvLines();
    }
}
