package com.pecunia.bs.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pecunia.bs.dto.Account;
import com.pecunia.bs.dto.Transaction;

public interface TransactionDAO extends JpaRepository<Transaction,Integer>
{
	public List<Transaction>  findAllTransByAccount(Account account);
}
