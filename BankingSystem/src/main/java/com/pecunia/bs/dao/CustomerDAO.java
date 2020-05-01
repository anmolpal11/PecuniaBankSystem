package com.pecunia.bs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pecunia.bs.dto.Customer;
public interface CustomerDAO  extends JpaRepository<Customer,Integer>
{

}
