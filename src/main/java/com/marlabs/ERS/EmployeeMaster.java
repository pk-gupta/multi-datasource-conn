package com.marlabs.ERS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_master")
public class EmployeeMaster {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="employee_id")
	private String employeeId;
	@Column(name="employee_name")
	private String employeeName;
	@Column(name="cn")
	private String cn;
	@Column(name="mail")
	private String mail;
	@Column(name="phone_number")
	private String phoneNumber;
	@Column(name="location")
	private String location;
	@Column(name="employee_manager_id")
	private String employeeManagerId;
	@Column(name="user_manager_id")
	private Integer userManagerId;
	@Column(name="employee_manager")
	private String employeeManager;
	@Column(name="manager")
	private String manager;
	
	@Column(name="employee_department_id")
	private Integer employeeDepartmentId;
	@Column(name="employee_department")
	private String employeeDepartment;
	@Column(name="department_id")
	private Integer departmentId;
	@Column(name="department")
	private String department;
	
	
	
	@Column(name="designation")
	private String designation;
	@Column(name="designation_id")
	private Integer designationId;
	@Column(name="designation_level")
	private Integer designationLevel;
	@Column(name="is_manager")
	private Boolean isManager;
	@Column(name="is_billable")
	private Boolean isBillable;
	@Column(name="is_active")
	private Boolean isActive;
	@Column(name="employee_type",length=5)
	private String employeeType;
	@Column(name="role_id")
	private Integer roleId;
	
	
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
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmployeeManagerId() {
		return employeeManagerId;
	}
	public void setEmployeeManagerId(String employeeManagerId) {
		this.employeeManagerId = employeeManagerId;
	}
	public Integer getUserManagerId() {
		return userManagerId;
	}
	public void setUserManagerId(Integer userManagerId) {
		this.userManagerId = userManagerId;
	}
	public String getEmployeeManager() {
		return employeeManager;
	}
	public void setEmployeeManager(String employeeManager) {
		this.employeeManager = employeeManager;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Integer getEmployeeDepartmentId() {
		return employeeDepartmentId;
	}
	public void setEmployeeDepartmentId(Integer employeeDepartmentId) {
		this.employeeDepartmentId = employeeDepartmentId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
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
	public Boolean getIsManager() {
		return isManager;
	}
	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}
	public Boolean getIsBillable() {
		return isBillable;
	}
	public void setIsBillable(Boolean isBillable) {
		this.isBillable = isBillable;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	

}
