package org.marlabs.department;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    private static final Logger LOG = LoggerFactory.getLogger(DepartmentRepositoryImpl.class);
	@Override
	public List<Department> listDepartments() {
		try {
			return departmentRepository.listDepartments();
		}catch(Exception e) {
			LOG.error("-------Exception in Department repository impl-----", e);
		}
		return Collections.emptyList();
		
	}

}
