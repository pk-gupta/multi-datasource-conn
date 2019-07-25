//package com.marlabs.ERS;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "empTest")
//public class EmpTest {
//
//	@Id
//	@Column(name="employee_id")
//	private String employeeId;
//	@Column(name="employee_name")
//	private String employeeName;
//	@ManyToOne
//	@JoinColumn(name="employee_department_id")
//	private DeptTest employeeDepartmentId;
//	
//	
//	public String getEmployeeId() {
//		return employeeId;
//	}
//	public void setEmployeeId(String employeeId) {
//		this.employeeId = employeeId;
//	}
//	public String getEmployeeName() {
//		return employeeName;
//	}
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//	
//
//	public DeptTest getEmployeeDepartmentId() {
//		return employeeDepartmentId;
//	}
//	public void setEmployeeDepartmentId(DeptTest employeeDepartmentId) {
//		this.employeeDepartmentId = employeeDepartmentId;
//	}
//
//}
