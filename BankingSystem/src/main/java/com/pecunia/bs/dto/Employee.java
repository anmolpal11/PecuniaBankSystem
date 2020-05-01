package com.pecunia.bs.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
@Table(name="bankemployees")
public class Employee 
{
     @Id
     @Column(name="emp_id")
     int empId;
     @Column(name="emp_name")
     String ename;
     @Column(name="emp_pwd")
     String password;
     @Column(name="emp_sal")
     double salary;
     @Column(name="emp_phone")
     long phone;
     String designation;
     @OneToOne
     @JoinColumn(name="aid")
     Address address;
     public Employee() {}
	public Employee(int empId, String ename, String password, double salary, long phone, String designation,Address address) 
	{
		this.empId = empId;
		this.ename = ename;
		this.password = password;
		this.salary = salary;
		this.phone = phone;
		this.designation = designation;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
