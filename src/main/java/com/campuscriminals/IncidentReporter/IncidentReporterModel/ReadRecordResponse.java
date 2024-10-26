package com.campuscriminals.IncidentReporter.IncidentReporterModel;

import lombok.Data;

import java.util.List;

@Data
public class ReadRecordResponse {
    private String caseId;
    private int numberOfIncidents;
    private List<String> incidentsList;
}
