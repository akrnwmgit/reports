package com.example.reports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportsController {

    @Autowired
    private ReportsRepository reportsRepository;

    @GetMapping("/reports")
    public List<Report>  getReports()
    {
        return reportsRepository.getReports();
    }
}


