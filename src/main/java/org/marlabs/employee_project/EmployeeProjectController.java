package org.marlabs.employee_project;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hris")
public class EmployeeProjectController {
	
	@Autowired
    private EmployeeProjectService employeeProjectService;

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeProjectController.class);
    @RequestMapping(value = "/employeeProjects", method = RequestMethod.GET, 
	produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmployeeProject>> getProjects() {
    	List<EmployeeProject> employeeProjects = new ArrayList<>();
    	try {
    		employeeProjects=employeeProjectService.listEmployeeProjects();
			return new ResponseEntity<>(employeeProjects,HttpStatus.OK);
		} catch (Exception e) {
			LOG.debug("------Exception In employeeprojectcontroller-----",e);
			return new ResponseEntity<>(employeeProjects,HttpStatus.NOT_FOUND);
		}
	}
	
}
