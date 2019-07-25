package org.marlabs.project;

import java.util.List;


@FunctionalInterface
public interface ProjectRepository {
	
	public List<Project> listProjects();
}
