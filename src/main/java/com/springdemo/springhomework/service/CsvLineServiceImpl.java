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

    public List<CsvLine> getLines() {
        return dao.getCsvLines();
    }

    public void showLines(){
        var lines = dao.getCsvLines();
        lines.forEach(x -> {
            System.out.println(x.getQuestion());
            System.out.println(x.getAnswersList());
        });
    }
}
