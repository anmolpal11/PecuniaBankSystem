package com.pecunia.bs.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pecunia.bs.dao.SanctionedLoansDAO;
import com.pecunia.bs.dto.SanctionedLoans;
@Service
public class SanctionedLoansService 
{
    @Autowired SanctionedLoansDAO sanctionedLoansDao;
    public void setSanctionedLoansDAO(SanctionedLoansDAO sanctionedLoansDao)
    {
    	this.sanctionedLoansDao = sanctionedLoansDao;
    }
    
    @Transactional(readOnly=true)
    public Optional<SanctionedLoans> getSanctionedLoans(int sanctionId)
    {
    	return this.sanctionedLoansDao.findById(sanctionId);
    }
    
    @Transactional(readOnly=true)
    public List<SanctionedLoans> getAllSanctionedLoans()
    {
    	return this.sanctionedLoansDao.findAll();
    }
    
    @Transactional
    public void insertSanctionedLoans(SanctionedLoans sanctionedLoans)
    {
    	this.sanctionedLoansDao.save(sanctionedLoans);
    }
    
    @Transactional
    public void  deleteSanctionedLoans(int sanctionId)
    {
    	this.sanctionedLoansDao.deleteById(sanctionId);
    }
}
