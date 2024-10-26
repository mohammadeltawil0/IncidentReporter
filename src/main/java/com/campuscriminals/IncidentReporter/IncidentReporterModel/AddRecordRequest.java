package com.campuscriminals.IncidentReporter.IncidentReporterModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddRecordRequest {
	private String caseId;
	private ReportDetails reportDetails;
}
