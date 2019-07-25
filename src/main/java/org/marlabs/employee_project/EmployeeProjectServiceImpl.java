package org.marlabs.employee_project;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeProjectServiceImpl implements EmployeeProjectService {
	
    @Autowired 
    private EmployeeProjectRepository employeeProjectRepository;
    
    private static final Logger LOG = LoggerFactory.getLogger(EmployeeProjectServiceImpl.class);
	@Override
	public List<EmployeeProject> listEmployeeProjects() {
		try {
			return employeeProjectRepository.listEmployeeProjects();
		}catch(Exception e) {
			LOG.error("-------Exception in EmployeeProjectServiceImpl-------",e);
		}
		return Collections.emptyList();
	}

}
