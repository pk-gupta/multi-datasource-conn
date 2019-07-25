package org.marlabs.employee_project;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeProjectRepositoryImpl implements EmployeeProjectRepository{
	
	@PersistenceUnit(unitName = "localContainerEntityManagerFactoryBeanCommonDB")
	private EntityManagerFactory entityManager;
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeProjectRepositoryImpl.class);
	@Transactional(readOnly=true)
	public List<EmployeeProject> listEmployeeProjects(){
		try {	
			Session session = entityManager.createEntityManager().unwrap(Session.class);
			Query query = session.createQuery("From EmployeeProject");
			return query.list();	
		} catch (Exception e) {
			LOG.debug("---------Exception in EmployeeProjectRepositoryImpl-------------",e);
		}
      return Collections.emptyList(); 
	}

	
}
