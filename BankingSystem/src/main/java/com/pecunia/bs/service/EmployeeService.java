package com.pecunia.bs.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pecunia.bs.dao.EmployeeDAO;
import com.pecunia.bs.dto.Employee;
@Service
public class EmployeeService 
{
     @Autowired EmployeeDAO employeeDao;
     public void setEmployeeDao(EmployeeDAO employeeDao) {this.employeeDao=employeeDao;}   
     
     @Transactional(readOnly=true)
     public Optional<Employee> getEmployee(int empId)
     {
    	 return this.employeeDao.findById(empId);
     }
     
     @Transactional(readOnly=true)
     public List<Employee> getEmployees()
     {
    	 return this.employeeDao.findAll();
     }
     
     @Transactional
     public void insertEmployee(Employee employee)
     {
    	  this.employeeDao.save(employee);
     }
     
     @Transactional
     public void deleteEmployee(int empId)
     {
    	 this.employeeDao.deleteById(empId);
     }
}
