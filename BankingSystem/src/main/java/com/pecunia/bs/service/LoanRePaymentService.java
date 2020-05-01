package com.pecunia.bs.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pecunia.bs.dao.LoanRePaymentDAO;
import com.pecunia.bs.dto.LoanRePayment;
@Service
public class LoanRePaymentService 
{
    @Autowired LoanRePaymentDAO loanRePaymentDao;
    public void setLoanRePaymentDao(LoanRePaymentDAO loanRePaymentDao)
    {
    	this.loanRePaymentDao = loanRePaymentDao;
    }
     
    @Transactional(readOnly=true)
    public Optional<LoanRePayment> getLoanRePayment(int loanPayId)
    {
    	return this.loanRePaymentDao.findById(loanPayId);
    }
 
    @Transactional(readOnly=true)
    public List<LoanRePayment> getAllLoanRePayment()
    {
    	return this.loanRePaymentDao.findAll();
    }
    
    @Transactional
    public void insertLoanRePayment(LoanRePayment loanRePayment)
    {
    	this.loanRePaymentDao.save(loanRePayment);
    }
    
    @Transactional(readOnly=true)
    public void deleteLoanRePayment(int loanPayId)
    {
    	this.loanRePaymentDao.deleteById(loanPayId);
    }
}