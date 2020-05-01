package com.pecunia.bs.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Loans 
{
    @Id
    @Column(name="loan_id")
    int loanId;
    @Column(name="loan_type")
    String loanType;
    @Column(name="loan_roi")
    double loanRoi;
    public Loans() { }
	public Loans(int loanId, String loanType, double loanRoi)
	{
		this.loanId = loanId;		this.loanType = loanType;		this.loanRoi = loanRoi;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanRoi() {
		return loanRoi;
	}
	public void setLoanRoi(double loanRoi) {
		this.loanRoi = loanRoi;
	}
}
