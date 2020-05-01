package com.pecunia.bs.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pecunia.bs.dao.FixedDepositsDAO;
import com.pecunia.bs.dto.FixedDeposits;
@Service
public class FixedDepositsService 
{
    @Autowired FixedDepositsDAO fdDao;
    public void setFixedDepositsDAO(FixedDepositsDAO fdDao) {this.fdDao=fdDao;}
    
    @Transactional(readOnly=true)
    public Optional<FixedDeposits> getFixedDeposit(int fixedDepositId)
    {
    	return this.fdDao.findById(fixedDepositId);
    }
    
    @Transactional(readOnly=true)
    public List<FixedDeposits> getAllFixedDeposits()
    {
    	return this.fdDao.findAll();
    }
    
    @Transactional
    public void insertFixedDeposit(FixedDeposits fixedDeposit)
    {
    	this.fdDao.save(fixedDeposit);
    	this.fdDao.flush();
    }
    
    @Transactional(readOnly=true)
    public void deleteFixedDeposit(int fixedDepositId)
    {
    	this.fdDao.deleteById(fixedDepositId);
    }
}
