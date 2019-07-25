package org.marlabs.employee;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{


	@PersistenceUnit(unitName = "localContainerEntityManagerFactoryBeanCommonDB")
	private EntityManagerFactory entityManager;

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeRepositoryImpl.class);
	@Transactional
	@Override
	public List<Employee> listEmployee() {
		try {
			Session session = entityManager.createEntityManager().unwrap(Session.class);
			Query query = session.createQuery("From Employee");
			return query.list();
		} catch (Exception e) {
			LOG.debug("----Exception in EmployeeRepositoryImpl-----",e);
		}
		return Collections.emptyList();
	}
	
}