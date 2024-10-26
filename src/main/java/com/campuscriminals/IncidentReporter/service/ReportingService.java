package com.campuscriminals.IncidentReporter.service;

import com.campuscriminals.IncidentReporter.IncidentReporterModel.AddRecordRequest;
import com.campuscriminals.IncidentReporter.IncidentReporterModel.AddRecordResponse;

public interface ReportingService {
    AddRecordResponse createReport(AddRecordRequest requesstModel);
}
