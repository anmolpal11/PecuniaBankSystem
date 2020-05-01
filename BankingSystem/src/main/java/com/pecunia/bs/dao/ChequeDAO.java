package com.pecunia.bs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pecunia.bs.dto.Cheque;
public interface ChequeDAO extends JpaRepository<Cheque,Integer>
{

}
