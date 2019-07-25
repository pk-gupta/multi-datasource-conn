package com.marlabs.ERS;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.marlabs.department.Department;
import org.marlabs.department.DepartmentService;
import org.marlabs.employee.Employee;
import org.marlabs.employee.EmployeeService;
import org.marlabs.employee_project.EmployeeProject;
import org.marlabs.employee_project.EmployeeProjectService;
import org.marlabs.project.Project;
import org.marlabs.project.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulerServiceImpl implements SchedulerService {
    @Autowired
    private SchedulerRepository schedulerRepository;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ProjectService projectService;
    @Autowired
    private EmployeeProjectService employeeProjectService;
    private static final Logger LOG = LoggerFactory.getLogger(SchedulerServiceImpl.class);
	
	@Override
	public void updateDepartments() {
		try {
			List<Department> departmentCommonData = departmentService.listDepartments();
			List<DepartmentMaster> departmentERSData = schedulerRepository.listDepartments();
			List<DepartmentMaster> saveERSDepartmentData = new ArrayList<>();
			for(Department deptCommonData : departmentCommonData){
				DepartmentMaster saveERSDeptObject = new DepartmentMaster();
				for( DepartmentMaster deptERSData : departmentERSData){					
					if(deptCommonData.getDepartmentName().equalsIgnoreCase(deptERSData.getDepartmentCode())) {
						saveERSDeptObject.setId(deptERSData.getId());
					}
				}
					saveERSDeptObject.setDepartmentCode(deptCommonData.getDepartmentName());
					saveERSDeptObject.setDepartmentDesc(deptCommonData.getDepartmentName());
					saveERSDeptObject.setDepartmentManager(deptCommonData.getDepartmentManager());
					saveERSDeptObject.setDepartmentManagerId(deptCommonData.getDepartmentManagerId());
					saveERSDeptObject.setDepatmentId(deptCommonData.getDepartmentId());
					saveERSDepartmentData.add(saveERSDeptObject);
					
			}
			if(!saveERSDepartmentData.isEmpty()) {
				schedulerRepository.updateDepartments(saveERSDepartmentData);
			}
			
		}catch(Exception e) {
			LOG.error("-----Exception in SchedulerServiceImpl updateDepartments() method-------", e);
		}
		
		
		
	}
	@Override
	public void updateEmployees() {
		try {
			List<Employee> employeeCommonData = employeeService.listEmployees();
			List<EmployeeMaster> employeeERSData = schedulerRepository.listEmployees();
			List<EmployeeMaster> saveERSEmployeeData = new ArrayList<>();
			for(Employee empCommonData:employeeCommonData) {
				EmployeeMaster saveERSEmpObject = new EmployeeMaster();
				for(EmployeeMaster empERSData:employeeERSData) {
					if(empERSData.getMail().equalsIgnoreCase(empCommonData.getEmail())) {
						saveERSEmpObject.setId(empERSData.getId());			
					}
				}
				saveERSEmpObject.setEmployeeId(empCommonData.getEmployeeId());
				saveERSEmpObject.setCn(empCommonData.getEmployeeName());
				saveERSEmpObject.setEmployeeName(empCommonData.getEmployeeName());
				saveERSEmpObject.setMail(empCommonData.getEmail());
				saveERSEmpObject.setPhoneNumber(empCommonData.getPhoneNumber());
				saveERSEmpObject.setLocation(empCommonData.getLocation());
				//employee manager data
				saveERSEmpObject.setEmployeeManagerId(empCommonData.getEmployeeManagerId());
				saveERSEmpObject.setEmployeeManager(empCommonData.getEmployeeManager());
				saveERSEmpObject.setUserManagerId(11111);
				saveERSEmpObject.setManager(empCommonData.getEmployeeManager());
				//Department
				saveERSEmpObject.setEmployeeDepartmentId(empCommonData.getEmployeeDepartmentId());
				saveERSEmpObject.setEmployeeDepartment(empCommonData.getEmployeeDepartment());
				saveERSEmpObject.setDepartmentId(empCommonData.getEmployeeDepartmentId());
				saveERSEmpObject.setDepartment(empCommonData.getEmployeeDepartment());
				//Designation
				saveERSEmpObject.setDesignation(empCommonData.getDesignation());
				saveERSEmpObject.setDesignationId(empCommonData.getDesignationId());
				saveERSEmpObject.setDesignationLevel(empCommonData.getDesignationLevel());
				//OtherData
				saveERSEmpObject.setIsManager(empCommonData.isManager());
				saveERSEmpObject.setIsBillable(empCommonData.isBillable());
				saveERSEmpObject.setIsActive(empCommonData.isActive());				
				saveERSEmpObject.setEmployeeType(empCommonData.getEmployee_type());	
				saveERSEmpObject.setRoleId(empCommonData.isManager() ? 2 : 3);				
				saveERSEmployeeData.add(saveERSEmpObject);
				
			}
			if(!saveERSEmployeeData.isEmpty()) {
				schedulerRepository.updateEmployees(saveERSEmployeeData);
			}
		}catch(Exception e) {
			LOG.error("-----Exception in SchedulerServiceImpl updateEmployees() method-------", e);
		}
		
		
	}
	@Override
	public void updateProjects() {
		try {
			List<Project> projectCommonData = projectService.listProjects();
			List<ProjectMaster> projectERSData = schedulerRepository.listProjects();
			List<ProjectMaster> saveERSProjectData = new ArrayList<>();
			for(Project prjctCommonData:projectCommonData) {
				ProjectMaster saveERSPrjctObject =new ProjectMaster();
				for(ProjectMaster prjctERSData:projectERSData) {
					if(prjctERSData.getPeojectDesc().equalsIgnoreCase(prjctCommonData.getProjectName())) {
						saveERSPrjctObject.setId(prjctERSData.getId());
					}
				}
				saveERSPrjctObject.setProjectId(prjctCommonData.getProjectId());
				saveERSPrjctObject.setProjectCode(prjctCommonData.getProjectName());
				saveERSPrjctObject.setPeojectDesc(prjctCommonData.getProjectName());
				saveERSPrjctObject.setProjectManagerId(prjctCommonData.getProjectManagerId());
				saveERSPrjctObject.setProjectManager(prjctCommonData.getProjectManager());
				saveERSPrjctObject.setProjectType(prjctCommonData.getProjectType());
				saveERSPrjctObject.setIsActive(false);
				saveERSPrjctObject.setIsBillable(false);
				saveERSPrjctObject.setStartDate(prjctCommonData.getProjectStartDate());
				saveERSPrjctObject.setEndDate(prjctCommonData.getProjectEndDate());
				saveERSPrjctObject.setClosureDate(prjctCommonData.getProjectClosureDate());
				saveERSProjectData.add(saveERSPrjctObject);
							
			}
			if(!saveERSProjectData.isEmpty()) {
				schedulerRepository.updateProjects(saveERSProjectData);
			}
				
			
		}catch(Exception e) {
			LOG.error("-----Exception in SchedulerServiceImpl updateProjects() method -------", e);
		}
		
		
	}
	@Override
	public void updateEmployeeProjects() {
		try {
			List<EmployeeProject> employeeProjectCommonData = employeeProjectService.listEmployeeProjects();
			List<EmployeeProjectMaster> employeeProjectERSData = schedulerRepository.listEmployeeProjects();
			List<EmployeeProjectMaster> saveERSEmpProjectData = new ArrayList<>();
			for(EmployeeProject empProjectCommonData:employeeProjectCommonData) {
				EmployeeProjectMaster saveERSEmpProjectObject = new EmployeeProjectMaster();
				for(EmployeeProjectMaster empProjectERSData:employeeProjectERSData) {
					if(!empProjectERSData.getId().equals(25547)) {
						if(empProjectERSData.getEmployeeName().equalsIgnoreCase(empProjectCommonData.getEmployeeName())
								&& empProjectERSData.getEmployeeProject().equalsIgnoreCase(empProjectCommonData.getEmployeeProject())) {
							saveERSEmpProjectObject.setId(empProjectERSData.getId());
						}
					}
						
					
					saveERSEmpProjectObject.setEmployeeId(empProjectCommonData.getEmployeeId());
					saveERSEmpProjectObject.setEmployeeName(empProjectCommonData.getEmployeeName());
					saveERSEmpProjectObject.setProjectId(empProjectCommonData.getEmployeeProjectId());
					saveERSEmpProjectObject.setEmployeeProjectCode(empProjectCommonData.getEmployeeProject());				
					saveERSEmpProjectObject.setEmployeeProject(empProjectCommonData.getEmployeeProject());
					saveERSEmpProjectObject.setLocation(empProjectCommonData.getLocation());
					saveERSEmpProjectObject.setManager(empProjectCommonData.getProjectManagerName());
					saveERSEmpProjectObject.setManagerId(empProjectCommonData.getProjectManagerId());
					}
				saveERSEmpProjectData.add(saveERSEmpProjectObject);
			}			
			schedulerRepository.updateEmployeeProjects(saveERSEmpProjectData);
		}catch(Exception e) {
			LOG.error("-----Exception in SchedulerServiceImpl updateEmployeeProjects() method -------", e);
		}
		
	}

}
