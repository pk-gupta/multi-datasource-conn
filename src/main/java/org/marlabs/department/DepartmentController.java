package org.marlabs.department;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hris")
public class DepartmentController {
	
	@Autowired
    private DepartmentService departmentService;
	private static final Logger LOG = LoggerFactory.getLogger(DepartmentController.class); 	
    @RequestMapping(value = "/departments", method = RequestMethod.GET, 
	produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Department>> getProjects() {
		List<Department> departments = new ArrayList<>();
		try {
			departments=departmentService.listDepartments();
			return new ResponseEntity<>(departments,HttpStatus.OK);
		} catch (Exception e) {
			LOG.error("---DepartmentController listDepartments()--", e);
			return new ResponseEntity<>(departments,HttpStatus.NOT_FOUND);
		}
	}
}
