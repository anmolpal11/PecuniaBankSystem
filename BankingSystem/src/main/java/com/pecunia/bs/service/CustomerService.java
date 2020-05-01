package com.pecunia.bs.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pecunia.bs.dao.CustomerDAO;
import com.pecunia.bs.dto.Customer;
@Service
public class CustomerService 
{
   @Autowired CustomerDAO customerDao;
   public void setCustomerDao(CustomerDAO customerDao) { this.customerDao=customerDao;}
   
   @Transactional(readOnly=true)
   public Optional<Customer> getCustomer(int customerId)
   {
	   return this.customerDao.findById(customerId);
   }
   
   @Transactional(readOnly=true)
   public List<Customer> getCustomers()
   {
	   return this.customerDao.findAll();
   } 
   
   @Transactional
   public void insertCustomer(Customer customer)
   {
	   this.customerDao.save(customer);
   }
   
   @Transactional
   public void deleteCustomer(int customerId)
   {
	   this.customerDao.deleteById(customerId);
   }
}
