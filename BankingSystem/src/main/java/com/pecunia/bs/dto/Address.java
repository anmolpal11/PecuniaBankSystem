package com.pecunia.bs.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="address1")
public class Address 
{
    @Id
    @Column(name="aid")
    int addressId;
    String hno;
    int street;
    String city;
    String state;
    String country;
    public Address() {}
	public Address(int addressId, String hno, int street, String city, String state, String country) 
	{
		this.addressId = addressId;		this.hno = hno;		this.street = street;
		this.city = city;		this.state = state;		this.country = country;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public int getStreet() {
		return street;
	}
	public void setStreet(int street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
