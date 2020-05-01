package com.pecunia.bs.dto;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class LoanRequest 
{
    @Id
    @Column(name="request_id")
    int requestId;
    @Column(name="request_date")
    LocalDate requestDate;
    @Column(name="cust_income")
    double customerIncome;
    @OneToOne
    @JoinColumn(name="cust_id")
    Customer customes;
    @OneToOne
    @JoinColumn(name="loan_id")
    Loans loan;
    @Column(name="request_status")
    String status;
    public LoanRequest() { }
	public LoanRequest(int requestId, LocalDate requestDate, double customerIncome, Customer customes, Loans loan,	String status) 
	{
		this.requestId = requestId;
		this.requestDate = requestDate;
		this.customerIncome = customerIncome;
		this.customes = customes;
		this.loan = loan;
		this.status = status;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public LocalDate getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}
	public double getCustomerIncome() {
		return customerIncome;
	}
	public void setCustomerIncome(double customerIncome) {
		this.customerIncome = customerIncome;
	}
	public Customer getCustomes() {
		return customes;
	}
	public void setCustomes(Customer customes) {
		this.customes = customes;
	}
	public Loans getLoan() {
		return loan;
	}
	public void setLoan(Loans loan) {
		this.loan = loan;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
