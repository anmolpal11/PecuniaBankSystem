package com.pecunia.bs.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pecunia.bs.dao.LoanRequestDAO;
import com.pecunia.bs.dto.LoanRequest;
@Service
public class LoanRequestService 
{
    @Autowired LoanRequestDAO loanRequestDao;
    public void setLoanRequestDao(LoanRequestDAO loanRequestDao)
    {
    	this.loanRequestDao=loanRequestDao;
    }
    
    @Transactional(readOnly=true)
    public Optional<LoanRequest> getLoanRequest(int requestId)
    {
    	return this.loanRequestDao.findById(requestId);
    }
    
    @Transactional(readOnly=true)
    public List<LoanRequest> getAllLoanRequest()
    {
    	return this.loanRequestDao.findAll();
    }
    
    @Transactional(readOnly=true)
    public void insertLoanRequest(LoanRequest loanRequest)
    {
    	 this.loanRequestDao.save(loanRequest);
    }
    
    @Transactional
    public void deleteLoanRequest(int requestId)
    {
    	 this.loanRequestDao.deleteById(requestId);
    }
}
