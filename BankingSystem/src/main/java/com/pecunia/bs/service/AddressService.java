package com.pecunia.bs.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pecunia.bs.dao.AddressDAO;
import com.pecunia.bs.dto.Address;
@Service
public class AddressService 
{
     @Autowired AddressDAO addressDao;
     public void setAddressDao(AddressDAO addressDao) {this.addressDao=addressDao;}
     
     @Transactional(readOnly=true)
     public Optional<Address> getAddress(int addressId)
     {
    	 return addressDao.findById(addressId);
     }
     
     @Transactional(readOnly=true)
     public List<Address> getAddresses()
     {
    	 return addressDao.findAll();
     }
     
     @Transactional
     public void insertAddress(Address address)
     {
    	 addressDao.save(address);
     }
     
     @Transactional
     public void deleteAddress(int addressId)
     {
    	 addressDao.deleteById(addressId);
     }
}
