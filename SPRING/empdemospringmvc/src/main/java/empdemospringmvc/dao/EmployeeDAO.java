package empdemospringmvc.dao;

import empdemospringmvc.dto.EmployeeBean;

public interface EmployeeDAO {
 EmployeeBean login(int id,String password);
 boolean register(EmployeeBean bean);
 boolean changePassword(int id,String password);
 boolean delete(int id);
 boolean update(EmployeeBean bean);
 EmployeeBean search(int id);
}
