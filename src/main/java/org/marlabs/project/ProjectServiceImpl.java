package org.marlabs.project;

import java.util.Collections;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
    private static final Logger LOG = LoggerFactory.getLogger(ProjectServiceImpl.class);

	@Override
	public List<Project> listProjects() {
		try {
			return projectRepository.listProjects();
		}catch(Exception e) {
			LOG.error("-------  Exception in Project Service Impl------",e);
		}
		return Collections.emptyList();
	}

}
