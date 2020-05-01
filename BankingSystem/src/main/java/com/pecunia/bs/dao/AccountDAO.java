package com.pecunia.bs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pecunia.bs.dto.Account;
public interface AccountDAO  extends JpaRepository<Account,Long>
{

}
