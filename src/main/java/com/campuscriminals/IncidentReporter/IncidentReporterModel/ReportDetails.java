package com.campuscriminals.IncidentReporter.IncidentReporterModel;

import lombok.Data;

@Data
public class ReportDetails {
    private String time;
    private String location;
    private String description;
    private String firstName;
    private String lastName;
    private String studentID;
    private boolean isStudent;
    private boolean isIndentified;

}
