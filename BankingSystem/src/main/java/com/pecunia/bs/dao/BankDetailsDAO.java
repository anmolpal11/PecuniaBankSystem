package com.pecunia.bs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pecunia.bs.dto.BanksDetails;
public interface BankDetailsDAO  extends JpaRepository<BanksDetails,String>
{

}
