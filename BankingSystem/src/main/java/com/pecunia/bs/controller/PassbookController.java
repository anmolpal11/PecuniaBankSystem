package com.pecunia.bs.controller;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pecunia.bs.dto.Account;
import com.pecunia.bs.dto.Cheque;
import com.pecunia.bs.dto.Transaction;
import com.pecunia.bs.dto.Transactions;
import com.pecunia.bs.service.AccountService;
import com.pecunia.bs.service.TransactionService;

@RestController
@CrossOrigin
public class PassbookController 
{
	@Autowired
	TransactionService transactionService;
	@Autowired
	AccountService accountService;
	public void setAccountService(AccountService accountService)
	{
		this.accountService = accountService;
	}
	public void setTransactionService(TransactionService transactionService) 
	{
		this.transactionService = transactionService;
	}
	@GetMapping(value="/accountSummary/accountNo/{accNo}/startDate/{startDate}/endDate/{endDate}",produces= {"application/json","application/xml"})
	public ResponseEntity<Transactions> accountSummary(@PathVariable long accNo,@PathVariable String startDate,@PathVariable String endDate) throws ParseException
	{
		try 
		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate beforeDate = LocalDate.parse(startDate, formatter);
			LocalDate afterDate = LocalDate.parse(endDate,formatter);
			Account account = accountService.getAccount(accNo).get();
			List<Transaction> transactionList = transactionService.getAllTransactionByAccount(account);
			List<Transaction> transactionNewList = new ArrayList<>();
			for(Transaction transaction : transactionList)
			{
				if(transaction.getTransactionDate().isAfter(beforeDate) && transaction.getTransactionDate().isBefore(afterDate))
				{
					if(transaction.getChequeDetails()== null)
					{
						transaction.setChequeDetails(new Cheque());
					}
					transactionNewList.add(transaction);
				}
			}
			Transactions transactions = new Transactions();
			transactions.setTransactions(transactionNewList);
			return new ResponseEntity(transactions,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity("Account does not exist",HttpStatus.NOT_FOUND);
		}		
	}
	@GetMapping(value="/passbookUpdate/accountNo/{accNo}/lasttransaction/{lastTransaction}",produces= {"application/json","application/xml"})
	public ResponseEntity<Transactions> passbookUpdate(@PathVariable long accNo,@PathVariable int lastTransaction) 
	{
		try
		{
			Account account = accountService.getAccount(accNo).get();
			List<Transaction> transactionList = transactionService.getAllTransactionByAccount(account);
			List<Transaction> transactionNewList = new ArrayList<>();
			for(Transaction transaction : transactionList)
			{
				if(transaction.getTransId() > lastTransaction)
				{
					if(transaction.getChequeDetails() == null)
					{
						transaction.setChequeDetails(new Cheque());
					}
					transactionNewList.add(transaction);
				}
			}
			Transactions transactions = new Transactions();
			transactions.setTransactions(transactionNewList);
			return new ResponseEntity(transactions,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity("Account Does not exist",HttpStatus.NOT_FOUND);
		}	
	}
}
