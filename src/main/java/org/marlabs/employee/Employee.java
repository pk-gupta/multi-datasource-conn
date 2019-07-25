package org.marlabs.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ERS_view_Employee")
public class Employee {
	@Id
	@Column(name = "[Employee Id]")
	private String employeeId;

	@Column(name = "[Employee Department]")
	private String employeeDepartment;

	@Column(name = "[Employee Department Id]")
	private Integer employeeDepartmentId;

	@Column(name = "[Employee Name]")
	private String employeeName;
	
	@Column(name = "[Location]")
	private String location;
	
	@Column(name = "[Mail]")
	private String email;
	
	@Column(name = "[Phone Number]")
	private String phoneNumber;
	
	@Column(name = "[Employee Manager]")
	private String employeeManager;
	
	@Column(name = "[Employee ManagerId]")
	private String employeeManagerId;
	
	@Column(name = "[Designation]")
	private String designation;
	
	@Column(name = "[Designation Id]")
	private Integer designationId;
	
	@Column(name = "[Designation Level]")
	private Integer designationLevel;
	
	@Column(name = "[IsManager]")
	private boolean isManager;
	
	@Column(name = "[Billable or not]")
	private boolean isBillable;
	
	@Column(name = "[IsActive]")
	private boolean isActive;
	
	@Column(name = "[EmployeeType]")
	private String employee_type;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public Integer getEmployeeDepartmentId() {
		return employeeDepartmentId;
	}

	public void setEmployeeDepartmentId(Integer employeeDepartmentId) {
		this.employeeDepartmentId = employeeDepartmentId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmployeeManager() {
		return employeeManager;
	}

	public void setEmployeeManager(String employeeManager) {
		this.employeeManager = employeeManager;
	}

	public String getEmployeeManagerId() {
		return employeeManagerId;
	}

	public void setEmployeeManagerId(String employeeManagerId) {
		this.employeeManagerId = employeeManagerId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getDesignationId() {
		return designationId;
	}

	public void setDesignationId(Integer designationId) {
		this.designationId = designationId;
	}

	public Integer getDesignationLevel() {
		return designationLevel;
	}

	public void setDesignationLevel(Integer designationLevel) {
		this.designationLevel = designationLevel;
	}

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

	public boolean isBillable() {
		return isBillable;
	}

	public void setBillable(boolean isBillable) {
		this.isBillable = isBillable;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

	public String getEmployee_type() {
		return employee_type;
	}

	public void setEmployee_type(String employee_type) {
		this.employee_type = employee_type;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeDepartment=" + employeeDepartment
				+ ", employeeDepartmentId=" + employeeDepartmentId + ", employeeName=" + employeeName + ", location="
				+ location + ", email=" + email + ", phoneNumber=" + phoneNumber + ", employeeManager="
				+ employeeManager + ", employeeManagerId=" + employeeManagerId + ", designation=" + designation
				+ ", designationId=" + designationId + ", designationLevel=" + designationLevel + ", isManager="
				+ isManager + ", isBillable=" + isBillable + ", isActive=" + isActive + ", employee_type="
				+ employee_type + "]";
	}


    
	
	

}
