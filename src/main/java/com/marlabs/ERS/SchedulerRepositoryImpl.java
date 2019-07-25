package com.marlabs.ERS;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SchedulerRepositoryImpl implements SchedulerRepository{
	
	private static final Logger LOG = LoggerFactory.getLogger(SchedulerRepositoryImpl.class);
	
	@PersistenceUnit(unitName = "localContainerEntityManagerFactoryBeanERSDB")
    private EntityManagerFactory entityManager;
	
	@Transactional
	@Override
	public void updateDepartments(List<DepartmentMaster> departments) {
			Session session = null;
			Transaction tx = null;
			try {
				session = entityManager.createEntityManager().unwrap(Session.class);
				tx = session.beginTransaction();
				for(DepartmentMaster department : departments) {
					session.merge(department);
				}			
				tx.commit();
				}catch(Exception e) {
				LOG.error("-----Exception in SchedulerRepositoryImpl updateDepartments() method, while updating Department data----", e);
				if (tx!=null) 
					tx.rollback();
				}finally {
					if(session!=null) 
						session.close();
				 }
			}
	
	@Transactional
	@Override
	public void updateEmployees(List<EmployeeMaster> employees) {
		Session session = null;
		Transaction tx = null;
		try {
			session = entityManager.createEntityManager().unwrap(Session.class);
			tx = session.beginTransaction();
			for(EmployeeMaster employee : employees) {
				session.saveOrUpdate(employee);
			}			
			tx.commit();
			}catch(Exception e) {
			LOG.error("-----Exception in SchedulerRepositoryImpl updateEmployees() method, while updating Employee data----", e);
			if (tx!=null) 
				tx.rollback();
			}finally {
				if(session!=null) 
					session.close();
			 }
		}
	
	@Transactional
	@Override
	public void updateProjects(List<ProjectMaster> projects) {
		Session session = null;
		Transaction tx = null;
		try {
			session = entityManager.createEntityManager().unwrap(Session.class);
			tx = session.beginTransaction();
			for(ProjectMaster project : projects) {
				session.merge(project);
			}			
			tx.commit();
			}catch(Exception e) {
			LOG.error("-----Exception in SchedulerRepositoryImpl updateProjects() method, while updating Project data----", e);
			if (tx!=null) 
				tx.rollback();
			}finally {
				if(session!=null) 
					session.close();
			 }
		}
    
	@Transactional
	@Override
	public void updateEmployeeProjects(List<EmployeeProjectMaster> employeeProjects) {
		Session session = null;
		Transaction tx = null;
		try {
			session = entityManager.createEntityManager().unwrap(Session.class);
			tx = session.beginTransaction();
			for(EmployeeProjectMaster employeeProject : employeeProjects) {
				session.merge(employeeProject);
			}			
			tx.commit();
			}catch(Exception e) {
			LOG.error("-----Exception in SchedulerRepositoryImpl updateEmployeeProjects() method, while updating EmployeeProjects data----", e);
			if (tx!=null) 
				tx.rollback();
			}finally {
				if(session!=null) 
					session.close();
			 }
		
	}
	

	@Override
	@Transactional
	public List<DepartmentMaster> listDepartments(){
		try {	
			Session session = entityManager.createEntityManager().unwrap(Session.class);
			Query query = session.createQuery("From DepartmentMaster");
			return query.list() ;
		
		} catch (Exception e) {
			LOG.debug( "--Exception in SchedulerRepositoryImpl listDepartments()--", e);
		}
		return Collections.emptyList();
	}

	@Override
	public List<ProjectMaster> listProjects() {
		try {	
			Session session = entityManager.createEntityManager().unwrap(Session.class);
			Query query = session.createQuery("From ProjectMaster");
			return query.list() ;
		
		} catch (Exception e) {
			LOG.debug( "--Exception in SchedulerRepositoryImpl listProjects()--", e);
		}
		return Collections.emptyList();
	}

	@Override
	public List<EmployeeMaster> listEmployees() {
		try {	
			Session session = entityManager.createEntityManager().unwrap(Session.class);
			Query query = session.createQuery("From EmployeeMaster");
			return query.list() ;
		
		} catch (Exception e) {
			LOG.debug( "--Exception in SchedulerRepositoryImpl listEmployees()--", e);
		}
		return Collections.emptyList();
	}

	

	@Override
	public List<EmployeeProjectMaster> listEmployeeProjects() {
		try {	
			Session session = entityManager.createEntityManager().unwrap(Session.class);
			Query query = session.createQuery("From EmployeeProjectMaster");
			return query.list() ;
		
		} catch (Exception e) {
			LOG.debug( "--Exception in SchedulerRepositoryImpl listEmployeeProjects()--", e);
		}
		return Collections.emptyList();
	}
    /////////////////////////////////////
/*	@Transactional
	@Override
	public void saveData() {
		Session session = null;
		Transaction tx = null;
			session = entityManager.createEntityManager().unwrap(Session.class);
			tx = session.beginTransaction();
			DeptTest t = new DeptTest();
			DeptTest t1 = new DeptTest();
			t.setDepatmentId(101);
			t.setDepartmentManagerId("110");
			t1.setDepatmentId(102);
			t1.setDepartmentManagerId("120");
			session.save(t);session.save(t1);
			tx.commit();
			session.close();
			Session session1 = entityManager.createEntityManager().unwrap(Session.class);
			session1.beginTransaction();
			EmpTest e1 = new EmpTest();
			EmpTest e2 = new EmpTest();
			DeptTest test = new DeptTest();
			test.setDepatmentId(101);
			DeptTest test1 = new DeptTest();
			test1.setDepatmentId(102);
			e1.setEmployeeId("12034");e1.setEmployeeName("pappu gupta");e1.setEmployeeDepartmentId(test);
			e2.setEmployeeId("12122");e2.setEmployeeName("niraj");e1.setEmployeeDepartmentId(test1);
			
			session1.save(e1);
			session1.save(e2);
			session1.getTransaction().commit();
			session1.close();
		
	}*/
    /////////////////////////////////////
	
}
