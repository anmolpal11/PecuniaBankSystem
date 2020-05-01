package com.pecunia.bs.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pecunia.bs.dao.TransactionDAO;
import com.pecunia.bs.dto.Account;
import com.pecunia.bs.dto.Transaction;
@Service
public class TransactionService 
{
    @Autowired TransactionDAO transactionDao;
    public void setTransactionDao(TransactionDAO transactionDao)
    {
    	this.transactionDao = transactionDao;
    }
    
    @Transactional(readOnly=true)
    public Optional<Transaction> getTransaction(int transId)
    {
    	return this.transactionDao.findById(transId);
    }
    
    @Transactional(readOnly=true)
    public List<Transaction> getAllTransaction()
    {
    	return this.transactionDao.findAll();
    }
    
    @Transactional(readOnly = true)
    public List<Transaction> getAllTransactionByAccount(Account account)
    {
    	return transactionDao.findAllTransByAccount(account);
    }
    @Transactional
    public Transaction  insertTransaction(Transaction transaction)
    {
    	return this.transactionDao.save(transaction);
    }
    
    @Transactional
    public void deleteTransaction(int transId)
    {
    	this.transactionDao.deleteById(transId);
    }
}
