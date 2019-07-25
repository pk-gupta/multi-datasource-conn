package org.marlabs.employee;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    private static final Logger LOG = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	@Override
	public List<Employee> listEmployees() {
		try {
			return employeeRepository.listEmployee();
		}catch(Exception e){
			LOG.error("---- Exception in Employee Sevice Impl------",e);
		}
		
		return Collections.emptyList();
	}

}
