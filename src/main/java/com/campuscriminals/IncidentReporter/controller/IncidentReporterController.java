package com.campuscriminals.IncidentReporter.controller;


import com.campuscriminals.IncidentReporter.IncidentReporterModel.AddRecordRequest;
import com.campuscriminals.IncidentReporter.IncidentReporterModel.AddRecordResponse;
import com.campuscriminals.IncidentReporter.IncidentReporterModel.ReadRecordResponse;
import com.campuscriminals.IncidentReporter.service.ReportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IncidentReporterController {

	@Autowired
	ReportingService reportingService;

	@PostMapping("/create-report")
	public AddRecordResponse createReport(@RequestBody AddRecordRequest addRecordRequest){
		//TODO: Write logic that allows to create and store a report in the H2 database.

		return reportingService.createReport(addRecordRequest);
	}

//	@PostMapping("/read-report")
//	public ReadRecordResponse readReport(@RequestBody RequesstModel requestModel){
//		//TODO: Write logic that allows to read a report in the H2 database.
//		return new ReadRecordResponse();
//	}
//
//	@PostMapping("/manage-report")
//	public ResponseModel manageReport(@RequestBody RequesstModel requestModel){
//		//TODO: Write logic that allows to read a report in the H2 database.
//		return new ResponseModel();
//	}

}
