package com.example.reports;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Report {

    private  int id;
    private String patientName;
    private String reportName;
    private long price;

}
