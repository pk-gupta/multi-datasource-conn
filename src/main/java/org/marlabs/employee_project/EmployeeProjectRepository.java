package org.marlabs.employee_project;

import java.util.List;


@FunctionalInterface
public interface EmployeeProjectRepository {
	
	public List<EmployeeProject> listEmployeeProjects();
	
}
