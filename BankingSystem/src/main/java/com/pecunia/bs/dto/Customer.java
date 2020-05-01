package com.pecunia.bs.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Customer 
{
    @Id
    @Column(name="cust_id")
    int customerId;
    @Column(name="cust_name")
    String customerName;
    @Column(name="cust_phone")
    long phone;
    @Column(name="cust_email")
    String emailId;
    @Column(name="cust_pan")
    String customerPAN;
    @OneToOne
    @JoinColumn(name="aid")
    Address address;
    public Customer() { }
	public Customer(int customerId, String customerName, long phone, String emailId, String customerPAN,Address address) 
	{
		this.customerId = customerId;		this.customerName = customerName;		this.phone = phone;
		this.emailId = emailId;		this.customerPAN = customerPAN;		this.address = address;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCustomerPAN() {
		return customerPAN;
	}
	public void setCustomerPAN(String customerPAN) {
		this.customerPAN = customerPAN;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
