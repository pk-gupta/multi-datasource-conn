package org.marlabs.employee;

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
public class EmployeeController {
	
	@Autowired
    private EmployeeService employeeService;
	
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class); 	
    @RequestMapping(value = "/employees", method = RequestMethod.GET, 
	produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>> getProjects() {
		List<Employee> employees = new ArrayList<>();
		try {
			employees=employeeService.listEmployees();
			return new ResponseEntity<>(employees,HttpStatus.OK);
		} catch (Exception e) {
			LOG.error("---EmployeeController listEmployees()--", e);
			return new ResponseEntity<>(employees,HttpStatus.NOT_FOUND);
		}
	}
}
