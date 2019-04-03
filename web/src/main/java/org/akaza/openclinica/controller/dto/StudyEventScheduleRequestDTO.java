package org.akaza.openclinica.controller.dto;

import io.swagger.annotations.ApiModelProperty;

public class StudyEventScheduleRequestDTO {

	private String endDate;
	private String startDate;
	private String ordinal;
	private String studyEventOID;
				
	@ApiModelProperty(value = "ordinal",allowableValues = "1")
	public String getOrdinal() {
		return ordinal;
	}
	public void setOrdinal(String ordinal) {
		this.ordinal = ordinal;
	}
	
	@ApiModelProperty(required=true)
	public String getStudyEventOID() {
		return studyEventOID;
	}
	public void setStudyEventOID(String studyEventOID) {
		this.studyEventOID = studyEventOID;
	}
	
	@ApiModelProperty(value = "End Date", allowableValues = "yyyy-MM-dd")
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	@ApiModelProperty(value = "Start Date", allowableValues = "yyyy-MM-dd",required=true)
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}			

}