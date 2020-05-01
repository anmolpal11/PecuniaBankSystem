package com.pecunia.bs.controller;

import java.time.LocalDate;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pecunia.bs.dto.Account;
import com.pecunia.bs.dto.Cheque;
import com.pecunia.bs.dto.Transaction;
import com.pecunia.bs.service.AccountService;
import com.pecunia.bs.service.BanksDetailsService;
import com.pecunia.bs.service.ChequeService;
import com.pecunia.bs.service.TransactionService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class TransactionController {
	@Autowired
	TransactionService transactionService;
	@Autowired
	AccountService accountService;
	@Autowired
	ChequeService chequeService;
	@Autowired
	BanksDetailsService bankDetailsService;
	public void setBankDetailsService(BanksDetailsService bankDetailsService)
	{
		this.bankDetailsService = bankDetailsService;
	}
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	public void setChequeService(ChequeService chequeService) {
		this.chequeService = chequeService;
	}
	public void setTransactionService(TransactionService transactionService)
	{
		this.transactionService=transactionService;
	}
	@ExceptionHandler(value=NoSuchElementException.class)
	public ResponseEntity<String> accountNotFoundException()
	{
		return new ResponseEntity<>("Account not found",HttpStatus.NOT_FOUND);
	}
	@GetMapping(value="/creditusingslip/accno/{account_No}/amount/{amount}/slipno/{slipno}")
    public ResponseEntity<String> creditUsingSlip(@PathVariable long account_No,@PathVariable double amount,@PathVariable int slipno)
    {
		try
		{
		    Transaction transaction = new Transaction();	
		    Account account = new Account();
		    account = accountService.getAccount(account_No).get();
		    account.setBalance(account.getBalance()+amount);
		    transaction.setAccount(account);
		    transaction.setChequeDetails(null);
		    transaction.setSlipNo(slipno);
		    transaction.setTransactionAmount(amount);
		    transaction.setTransactionType("Credit");
		    transaction.setTransactionDate(LocalDate.now());
		    if(transactionService.insertTransaction(transaction)!=null)
				return new ResponseEntity<>("Successful",HttpStatus.OK);
			else
				return new ResponseEntity<>("Failed",HttpStatus.NOT_ACCEPTABLE);
		}
		catch(NoSuchElementException e)
		{
    		return new ResponseEntity<>("Account Not Found",HttpStatus.NOT_FOUND);
		}
    }
	@PostMapping(value="/creditusingcheque/accountno/{accountNo}",consumes= {"application/json","application/xml"})
	public ResponseEntity<String> creditUsingCheque(@PathVariable long accountNo,@RequestBody() Cheque cheque) 
	{
		try
		{
		    Transaction transaction = new Transaction();	
		    Account account = new Account();
		    System.out.println(cheque.getBank().getIfscCode());
		    bankDetailsService.insertBankDetails(cheque.getBank());
		    chequeService.insertCheque(cheque);
		    account = accountService.getAccount(accountNo).get();
		    account.setBalance(account.getBalance()+cheque.getChequeAmount());
		    transaction.setAccount(account);
		    transaction.setChequeDetails(cheque);
		    transaction.setSlipNo(0);
		    transaction.setTransactionAmount(cheque.getChequeAmount());
		    transaction.setTransactionType("Credit");
		    transaction.setTransactionDate(LocalDate.now());
		    if(transactionService.insertTransaction(transaction)!=null)
				return new ResponseEntity<>("Successful",HttpStatus.OK);
			else
				return new ResponseEntity<>("Failed",HttpStatus.NOT_ACCEPTABLE);
		}
		catch(NoSuchElementException e)
		{
    		return new ResponseEntity<>("Account Not Found",HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping(value="/debitusingslip/accno/{account_No}/amount/{amount}/slipno/{slipno}")
    public ResponseEntity<String> debitUsingSlip(@PathVariable long account_No,@PathVariable double amount,@PathVariable int slipno)
    {
		try
		{
		    Transaction transaction = new Transaction();	
		    Account account = new Account();
		    account = accountService.getAccount(account_No).get();
		    account.setBalance(account.getBalance()-amount);
		    transaction.setAccount(account);
		    transaction.setChequeDetails(null);
		    transaction.setSlipNo(slipno);
		    transaction.setTransactionAmount(amount);
		    transaction.setTransactionType("Debit");
		    transaction.setTransactionDate(LocalDate.now());
		    if(transactionService.insertTransaction(transaction)!=null)
				return new ResponseEntity<>("Successful",HttpStatus.OK);
			else
				return new ResponseEntity<>("Failed",HttpStatus.NOT_ACCEPTABLE);
		}
		catch(NoSuchElementException e)
		{
    		return new ResponseEntity<>("Account Not Found",HttpStatus.NOT_FOUND);
		}
    }
	@PostMapping(value="/debitusingcheque/accountno/{accountNo}",consumes= {"application/json","application/xml"})
	public ResponseEntity<String> debitUsingCheque(@PathVariable long accountNo,@RequestBody() Cheque cheque) 
	{
		try
		{
		    Transaction transaction = new Transaction();
		    bankDetailsService.insertBankDetails(cheque.getBank());
		    chequeService.insertCheque(cheque);
		    Account account = new Account();
		    account = accountService.getAccount(accountNo).get();
		    account.setBalance(account.getBalance()+cheque.getChequeAmount());
		    transaction.setAccount(account);
		    transaction.setChequeDetails(cheque);
		    transaction.setSlipNo(0);
		    transaction.setTransactionAmount(cheque.getChequeAmount());
		    transaction.setTransactionType("Debit");
		    transaction.setTransactionDate(LocalDate.now());
		    if(transactionService.insertTransaction(transaction)!=null)
				return new ResponseEntity<>("Successful",HttpStatus.OK);
			else
				return new ResponseEntity<>("Failed",HttpStatus.NOT_ACCEPTABLE);
		}
		catch(NoSuchElementException e)
		{
    		return new ResponseEntity<>("Account Not Found",HttpStatus.NOT_FOUND);
		}
	}
}






