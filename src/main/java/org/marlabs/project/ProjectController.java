package org.marlabs.project;

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
public class ProjectController {
	
	@Autowired
    private ProjectService projectService;
	private static final Logger LOG = LoggerFactory.getLogger(ProjectController.class);

    @RequestMapping(value = "/projects", method = RequestMethod.GET, 
	produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Project>> getProjects() {
    	List<Project> projects = new ArrayList<>();
		try {
			LOG.debug("------In ProjectController-----");
			projects=projectService.listProjects();
			return new ResponseEntity<>(projects,HttpStatus.OK);
		} catch (Exception e) {
			LOG.debug("------Exception In ProjectController-----",e);
			return new ResponseEntity<>(projects,HttpStatus.NOT_FOUND);
		}
	}
}