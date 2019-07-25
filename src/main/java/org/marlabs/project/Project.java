package org.marlabs.project;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ERS_view_Project")
public class Project{
	@Id
	@Column(name="[ProjectId]")
	private Integer projectId;
	
	@Column(name="[ProjectCode]")
	private String projectCode;
	
	@Column(name="[ProjectName]")
	private String projectName;
	
	@Column(name="[ProjectType]")
	private String projectType;
	
	@Column(name="[Project Manager]")
	private String projectManager;
	
	@Column(name="[Project Manager Id]")
	private String projectManagerId;	
	
	@Column(name="[Delivery Manager]")
	private String deliveryManager;
	
	@Column(name="[DeliveryMgrID]")
	private String deliveryManagerId;
	
	@Column(name="[Project Start Date]")
	private Date projectStartDate;
	
	@Column(name="[Project End Date]")
	private Date projectEndDate;
	
	@Column(name="[ProjectClosureDate]")
	private Date projectClosureDate;
	
	@Column(name="[Location]")
	private String location;

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public String getProjectManagerId() {
		return projectManagerId;
	}

	public void setProjectManagerId(String projectManagerId) {
		this.projectManagerId = projectManagerId;
	}

	public String getDeliveryManager() {
		return deliveryManager;
	}

	public void setDeliveryManager(String deliveryManager) {
		this.deliveryManager = deliveryManager;
	}

	public String getDeliveryManagerId() {
		return deliveryManagerId;
	}

	public void setDeliveryManagerId(String deliveryManagerId) {
		this.deliveryManagerId = deliveryManagerId;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public Date getProjectEndDate() {
		return projectEndDate;
	}

	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public Date getProjectClosureDate() {
		return projectClosureDate;
	}

	public void setProjectClosureDate(Date projectClosureDate) {
		this.projectClosureDate = projectClosureDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectCode=" + projectCode + ", projectName=" + projectName
				+ ", projectType=" + projectType + ", projectManager=" + projectManager + ", projectManagerId="
				+ projectManagerId + ", deliveryManager=" + deliveryManager + ", deliveryManagerId=" + deliveryManagerId
				+ ", projectStartDate=" + projectStartDate + ", projectEndDate=" + projectEndDate
				+ ", projectClosureDate=" + projectClosureDate + ", location=" + location + "]";
	}
	
	
	
	
}