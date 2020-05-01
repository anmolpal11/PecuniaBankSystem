package com.pecunia.bs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pecunia.bs.dto.Employee;
public interface EmployeeDAO extends JpaRepository<Employee,Integer>
{

}
