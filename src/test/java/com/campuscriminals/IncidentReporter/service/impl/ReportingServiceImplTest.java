package com.campuscriminals.IncidentReporter.service.impl;

import com.campuscriminals.IncidentReporter.IncidentReporterModel.AddRecordRequest;
import com.campuscriminals.IncidentReporter.IncidentReporterModel.AddRecordResponse;
import com.campuscriminals.IncidentReporter.service.ReportingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class ReportingServiceImplTest {

    @Mock
    ReportingService reportingService;

    @BeforeEach
    void setUp() {
        this.reportingService = new ReportingServiceImpl();
    }

    @Test
    void createReport() {
        AddRecordResponse responseModel = reportingService.createReport(createAddRecordRequest());
        assertNotNull(responseModel);
    }

    public AddRecordRequest createAddRecordRequest() {
        AddRecordRequest addRecordRequest = new AddRecordRequest();
        return addRecordRequest;
    }
}