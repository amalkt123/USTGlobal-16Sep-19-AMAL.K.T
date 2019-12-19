package empdemospringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import empdemospringmvc.dto.EmployeeBean;

public class EmployeeDaoImpl implements EmployeeDAO{
	final String SELECT_QUERY="select e from employeeBean e where e.id=:name";

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("employee-unit");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();

	public EmployeeBean login(int id, String password) {
		EmployeeBean bean=manager.find(EmployeeBean.class, id);
		if(password.equals(bean.getPassword())) {
			return bean;
		}

		// TODO Auto-generated method stub
		return null;
	}

	public boolean register(EmployeeBean bean) {
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		
		// TODO Auto-generated method stub
		return false;
	}

	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		EmployeeBean bean=search(id);
		if(bean!=null) {
			try {
				transaction.begin();
				bean.setPassword(password);
				transaction.commit();
				return true;
			}catch (Exception e) {
				transaction.rollback();
				e.printStackTrace();
				return false;
				// TODO: handle exception
			}
		}
		else {
			return false;
		}

	}

	public boolean delete(int id) {
		EmployeeBean bean=manager.find(EmployeeBean.class,id);
		try {
			transaction.begin();
			manager.remove(bean);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(EmployeeBean bean) {
		EmployeeBean bean2=manager.find(EmployeeBean.class, bean.getId());	
		try{
			transaction.begin();
			bean2.setDoj(bean.getDoj());
			bean2.setEmail(bean.getEmail());
			bean2.setGender(bean.getGender());
			bean2.setName(bean.getName());
			bean2.setPassword(bean.getPassword());
			transaction.commit();
		}catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}


		return false;
	}

	public EmployeeBean search(int id) {
		Query q=manager.createQuery(SELECT_QUERY);
		q.setParameter("name", id);
		EmployeeBean e=(EmployeeBean)q.getSingleResult();
		return e;
	}

}
