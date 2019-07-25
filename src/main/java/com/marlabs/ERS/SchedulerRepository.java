package com.marlabs.ERS;

import java.util.List;

public interface SchedulerRepository {

	public void updateDepartments(List<DepartmentMaster> saveERSDepartmentData);
	public void updateEmployees(List<EmployeeMaster> saveERSEmployeeData);
	public void updateProjects(List<ProjectMaster> saveERSProjectData);
	public void updateEmployeeProjects(List<EmployeeProjectMaster> saveERSEmployeeProjectData);

	

	public List<DepartmentMaster> listDepartments();
	public List<ProjectMaster> listProjects();
	public List<EmployeeMaster> listEmployees();
	public List<EmployeeProjectMaster> listEmployeeProjects();

	
	
}
