package org.marlabs.department;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository{
	
	private static final Logger LOG = LoggerFactory.getLogger(DepartmentRepositoryImpl.class);
	
	@PersistenceUnit(unitName = "localContainerEntityManagerFactoryBeanCommonDB")
    private EntityManagerFactory entityManager;
	@Transactional
	public List<Department> listDepartments(){
		try {	
			Session session = entityManager.createEntityManager().unwrap(Session.class);
			Query query = session.createQuery("From Department");
			return query.list() ;
		
		} catch (Exception e) {
			LOG.debug( "--Exception in DepartmentRepositoryImpl listDepartments()--", e);
		}
		return Collections.emptyList();
	}
}
