package com.example.reports;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class ReportsRepository {

    public List<Report> getReports()
    {
        return Stream.of(
                new Report(1,"David","ECG",1000),
                new Report(2,"Keith","EAG",1250),
                new Report(3,"Jeff","EBG",1430),
                new Report(4,"Lee","EDG",180),
                new Report(5,"Scott","EEG",400)
        ) .collect(Collectors.toList());

    }
}
