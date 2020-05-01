package com.pecunia.bs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pecunia.bs.dto.Address;
public interface AddressDAO extends JpaRepository<Address,Integer>
{

}
