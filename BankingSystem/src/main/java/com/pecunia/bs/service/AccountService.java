package com.pecunia.bs.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pecunia.bs.dao.AccountDAO;
import com.pecunia.bs.dto.Account;
@Service
public class AccountService 
{
     @Autowired AccountDAO accountDao;
     public void setAccountDao(AccountDAO accountDao) { this.accountDao=accountDao;}
     
     @Transactional(readOnly=true)
     public Optional<Account> getAccount(long accountNo)
     {
    	 return accountDao.findById(accountNo);
     }
     
     
     @Transactional(readOnly=true)
     public List<Account> getAccounts()
     {
    	 return accountDao.findAll();
     }
     
     @Transactional
     public void insertAccount(Account account)
     {
    	 accountDao.save(account);
     }
     
     @Transactional
     public void deleteAccount(long accountNo)
     {
    	  accountDao.deleteById(accountNo);
     }
}
