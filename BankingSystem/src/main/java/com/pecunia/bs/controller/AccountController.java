package com.pecunia.bs.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.pecunia.bs.dto.Account;
import com.pecunia.bs.dto.Transaction;
import com.pecunia.bs.service.AccountService;
import com.pecunia.bs.service.CustomerService;
import com.pecunia.bs.service.TransactionService;
@RestController
public class AccountController 
{
    @Autowired
    TransactionService transactionService;
    public void setTransactionService(TransactionService transactionService) { this.transactionService = transactionService;}
    @Autowired 
    AccountService accountService;
    public void setAccounService(AccountService accountService) { this.accountService = accountService; }
    
    @Autowired CustomerService customerService;
    public void setCustomerService(CustomerService customerService) { this.customerService = customerService; }
    
    @GetMapping(value="/getAccount/{accountNo}",produces="application/json")
    public Optional<Account> getAccountDetails(@PathVariable int accountNo)
    {
    	return accountService.getAccount(accountNo);
    }
    
    @GetMapping(value="/getAllAccounts",produces="application/json")
    public List<Account> getAllAccountsDetails()
    {
    	return accountService.getAccounts();
    }
    
    @PostMapping(value="/addAccount",consumes="application/json")
    public ResponseEntity<String> addAccountDetails(@RequestBody Account account)
    {
    	try
    	{
    		customerService.insertCustomer(account.getCustomer());
    		accountService.insertAccount(account);
    		return new ResponseEntity<String>("Account Details Added",HttpStatus.OK);
    	}
    	catch(Exception ex)
    	{
    		return new ResponseEntity<String>("Error in Adding Account",HttpStatus.BAD_REQUEST);
    	}
    }
    
    @DeleteMapping("/deleteAccount/{accountNo")
    public ResponseEntity<String> deleteAccountDetails(@PathVariable int accountNo)
    {
    	try
    	{
    		accountService.deleteAccount(accountNo);
    		return new ResponseEntity<String>("Account Details Deleted",HttpStatus.OK);
    	}
    	catch(Exception ex)
    	{
    		return new ResponseEntity<String>("Error in Deleting Account",HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value="/addTransaction",consumes="application/json")
    public ResponseEntity<String> addTransactionDetails(@RequestBody Transaction transaction)
    {
    	try
    	{
    		this.transactionService.insertTransaction(transaction);
    		return new ResponseEntity<String>("Transaction SuccessFull",HttpStatus.OK);
    	}
    	catch(Exception ex)
    	{
    		return new ResponseEntity<String>("Transaction Failed",HttpStatus.BAD_REQUEST);
    	}
    }
}
