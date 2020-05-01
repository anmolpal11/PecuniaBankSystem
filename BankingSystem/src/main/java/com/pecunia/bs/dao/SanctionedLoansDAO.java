package com.pecunia.bs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pecunia.bs.dto.SanctionedLoans;
public interface SanctionedLoansDAO extends JpaRepository<SanctionedLoans,Integer>
{

}
