package com.pecunia.bs.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pecunia.bs.dao.LoansDAO;
import com.pecunia.bs.dto.Loans;
@Service
public class LoansService 
{
    @Autowired LoansDAO loansDao;
    public void setLoansDao(LoansDAO loansDao)
    {
    	this.loansDao = loansDao;
    }
    
    @Transactional(readOnly=true)
    public Optional<Loans> getLoans(int loanId)
    {
    	return this.loansDao.findById(loanId);
    }
    
    @Transactional(readOnly=true)
    public List<Loans> getAllLoans()
    {
    	return this.loansDao.findAll();
    }
    
    @Transactional(readOnly=true)
    public void insertLoans(Loans loans)
    {
    	this.loansDao.save(loans);
    }
    
    @Transactional(readOnly=true)
    public void deleteLoans(int loanId)
    {
    	 this.loansDao.deleteById(loanId);
    }
}
