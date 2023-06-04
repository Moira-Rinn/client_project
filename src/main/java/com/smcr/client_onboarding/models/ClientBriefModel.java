package com.smcr.client_onboarding.models;

import org.springframework.data.annotation.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "client_brief")

public class ClientBriefModel {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;

	  @Column(name = "date")
	  private String date;

	  @Column(name = "client_name")
	  private String clientName;

	  @Column(name = "project_name")
	  private String projectName;

	  @Column(name = "project_number")
	  private String projectNumber;

	  @Column(name = "overview")
	  private String overview;

	  @Column(name = "goals_objectives")
	  private String goalsObjectives;

	  @Column(name = "target_audience")
	  private String targetAudience;

	  @Column(name = "design_requirements")
	  private String designRequirements;

	  @Column(name = "functional_requirements")
	  private String functionalRequirements;

	  @Column(name = "timeline")
	  private String timeline;

	  @Column(name = "content_creation")
	  private String contentCreation;

	  @Column(name = "testing_qa")
	  private String testingQA;

	  @Column(name = "launch_deployment")
	  private String launchDeployment;

	  @Column(name = "budget")
	  private String budget;

	  @Column(name = "reporting_communication")
	  private String reportingCommunication;

	  @Column(name = "initial_planning_meeting_date")
	  private String initialPlanningMeetingDate;

	  @Column(name = "initial_planning_meeting_location")
	  private String initialPlanningMeetingLocation;

	  @Column(name = "design_review_meeting1_date")
	  private String designReviewMeeting1Date;

	  @Column(name = "design_review_meeting1_location")
	  private String designReviewMeeting1Location;

	  @Column(name = "design_review_meeting2_date")
	  private String designReviewMeeting2Date;

	  @Column(name = "design_review_meeting2_location")
	  private String designReviewMeeting2Location;

	  @Column(name = "design_review_meeting3_date")
	  private String designReviewMeeting3Date;

	  @Column(name = "design_review_meeting3_location")
	  private String designReviewMeeting3Location;

	  @Column(name = "design_completion_meeting_date")
	  private String designCompletionMeetingDate;

	  @Column(name = "design_completion_meeting_location")
	  private String designCompletionMeetingLocation;

// ********** GETTERS AND SETTERS **********
	  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getGoalsObjectives() {
		return goalsObjectives;
	}

	public void setGoalsObjectives(String goalsObjectives) {
		this.goalsObjectives = goalsObjectives;
	}

	public String getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	public String getDesignRequirements() {
		return designRequirements;
	}

	public void setDesignRequirements(String designRequirements) {
		this.designRequirements = designRequirements;
	}

	public String getFunctionalRequirements() {
		return functionalRequirements;
	}

	public void setFunctionalRequirements(String functionalRequirements) {
		this.functionalRequirements = functionalRequirements;
	}

	public String getTimeline() {
		return timeline;
	}

	public void setTimeline(String timeline) {
		this.timeline = timeline;
	}

	public String getContentCreation() {
		return contentCreation;
	}

	public void setContentCreation(String contentCreation) {
		this.contentCreation = contentCreation;
	}

	public String getTestingQA() {
		return testingQA;
	}

	public void setTestingQA(String testingQA) {
		this.testingQA = testingQA;
	}

	public String getLaunchDeployment() {
		return launchDeployment;
	}

	public void setLaunchDeployment(String launchDeployment) {
		this.launchDeployment = launchDeployment;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getReportingCommunication() {
		return reportingCommunication;
	}

	public void setReportingCommunication(String reportingCommunication) {
		this.reportingCommunication = reportingCommunication;
	}

	public String getInitialPlanningMeetingDate() {
		return initialPlanningMeetingDate;
	}

	public void setInitialPlanningMeetingDate(String initialPlanningMeetingDate) {
		this.initialPlanningMeetingDate = initialPlanningMeetingDate;
	}

	public String getInitialPlanningMeetingLocation() {
		return initialPlanningMeetingLocation;
	}

	public void setInitialPlanningMeetingLocation(String initialPlanningMeetingLocation) {
		this.initialPlanningMeetingLocation = initialPlanningMeetingLocation;
	}

	public String getDesignReviewMeeting1Date() {
		return designReviewMeeting1Date;
	}

	public void setDesignReviewMeeting1Date(String designReviewMeeting1Date) {
		this.designReviewMeeting1Date = designReviewMeeting1Date;
	}

	public String getDesignReviewMeeting1Location() {
		return designReviewMeeting1Location;
	}

	public void setDesignReviewMeeting1Location(String designReviewMeeting1Location) {
		this.designReviewMeeting1Location = designReviewMeeting1Location;
	}

	public String getDesignReviewMeeting2Date() {
		return designReviewMeeting2Date;
	}

	public void setDesignReviewMeeting2Date(String designReviewMeeting2Date) {
		this.designReviewMeeting2Date = designReviewMeeting2Date;
	}

	public String getDesignReviewMeeting2Location() {
		return designReviewMeeting2Location;
	}

	public void setDesignReviewMeeting2Location(String designReviewMeeting2Location) {
		this.designReviewMeeting2Location = designReviewMeeting2Location;
	}

	public String getDesignReviewMeeting3Date() {
		return designReviewMeeting3Date;
	}

	public void setDesignReviewMeeting3Date(String designReviewMeeting3Date) {
		this.designReviewMeeting3Date = designReviewMeeting3Date;
	}

	public String getDesignReviewMeeting3Location() {
		return designReviewMeeting3Location;
	}

	public void setDesignReviewMeeting3Location(String designReviewMeeting3Location) {
		this.designReviewMeeting3Location = designReviewMeeting3Location;
	}

	public String getDesignCompletionMeetingDate() {
		return designCompletionMeetingDate;
	}

	public void setDesignCompletionMeetingDate(String designCompletionMeetingDate) {
		this.designCompletionMeetingDate = designCompletionMeetingDate;
	}

	public String getDesignCompletionMeetingLocation() {
		return designCompletionMeetingLocation;
	}

	public void setDesignCompletionMeetingLocation(String designCompletionMeetingLocation) {
		this.designCompletionMeetingLocation = designCompletionMeetingLocation;
	}



}
