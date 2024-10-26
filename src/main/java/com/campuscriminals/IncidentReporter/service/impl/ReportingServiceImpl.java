package com.campuscriminals.IncidentReporter.service.impl;

import com.campuscriminals.IncidentReporter.IncidentReporterModel.AddRecordRequest;
import com.campuscriminals.IncidentReporter.IncidentReporterModel.AddRecordResponse;
import com.campuscriminals.IncidentReporter.service.ReportingService;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class ReportingServiceImpl implements ReportingService {
    private static final int CASE_ID_MAX = 1000000;

    @Override
    public AddRecordResponse createReport(AddRecordRequest requesstModel) {
        AddRecordResponse responseModel = new AddRecordResponse();
        responseModel.setCaseId(generateCaseNumber());
        return responseModel;
    }

    private String generateCaseNumber(){
        Random generateNumber = new Random();
        return String.valueOf(generateNumber.nextInt(CASE_ID_MAX));
    }
}
