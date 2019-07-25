package org.marlabs.employee_project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ERS_view_EmployeeProject")
public class EmployeeProject {
	
	@Id
	@Column(name="[Id]")
	private Integer id;
	
	@Column(name="[Employee Id]")
	private String employeeId;
	
	@Column(name="[Employee Name]")
	private String employeeName;
	
	@Column(name="[Project Name]")
	private String employeeProject;
	
	@Column(name="[ProjectId Code]")
	private Integer employeeProjectId;
	
	@Column(name="[Location]")
	private String location;
	
	@Column(name="[Project ManagerId]")
	private String projectManagerId;
	
	@Column(name="[Project ManagerName]")
	private String projectManagerName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeProject() {
		return employeeProject;
	}

	public void setEmployeeProject(String employeeProject) {
		this.employeeProject = employeeProject;
	}

	public Integer getEmployeeProjectId() {
		return employeeProjectId;
	}

	public void setEmployeeProjectId(Integer employeeProjectId) {
		this.employeeProjectId = employeeProjectId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProjectManagerId() {
		return projectManagerId;
	}

	public void setProjectManagerId(String projectManagerId) {
		this.projectManagerId = projectManagerId;
	}

	public String getProjectManagerName() {
		return projectManagerName;
	}

	public void setProjectManagerName(String projectManagerName) {
		this.projectManagerName = projectManagerName;
	}

	@Override
	public String toString() {
		return "EmployeeProject [id=" + id + ", employeeId=" + employeeId + ", employeeName=" + employeeName
				+ ", employeeProject=" + employeeProject + ", employeeProjectId=" + employeeProjectId + ", location="
				+ location + ", projectManagerId=" + projectManagerId + ", projectManagerName=" + projectManagerName
				+ "]";
	}
	

	

	
	
	
}

