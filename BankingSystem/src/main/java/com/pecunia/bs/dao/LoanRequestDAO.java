package com.pecunia.bs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pecunia.bs.dto.LoanRequest;
public interface LoanRequestDAO extends JpaRepository<LoanRequest,Integer>
{

}
