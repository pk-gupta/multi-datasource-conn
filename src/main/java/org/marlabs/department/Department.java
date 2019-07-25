package org.marlabs.department;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ERS_view_Department")
public class Department {
	
	@Id
	@Column(name="[Department Id]")
	private Integer departmentId;
	
	@Column(name="[Department Head]")
	private String departmentManager;
	
	@Column(name="[Department Name]")
	private String departmentName;
	
	@Column(name="[Division]")
	private String division;
	
	@Column(name="[Department GroupName]", columnDefinition="nvarchar")
	private String departmentGroupName;
	
	@Column(name="[Department Manager Id]")
	private String departmentManagerId;
	
	
	Department(){
		
	}
	
	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentManager() {
		return departmentManager;
	}

	public void setDepartmentManager(String departmentManager) {
		this.departmentManager = departmentManager;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getDepartmentGroupName() {
		return departmentGroupName;
	}

	public void setDepartmentGroupName(String departmentGroupName) {
		this.departmentGroupName = departmentGroupName;
	}

	public String getDepartmentManagerId() {
		return departmentManagerId;
	}

	public void setDepartmentManagerId(String departmentManagerId) {
		this.departmentManagerId = departmentManagerId;
	}


	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentManager=" + departmentManager
				+ ", departmentName=" + departmentName + ", division=" + division + ", departmentGroupName="
				+ departmentGroupName + ", departmentManagerId=" + departmentManagerId + "]";
	}

	
	
	
	

	
	
	
	
	
	
}


