package com.pecunia.bs.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class LoanRePayment 
{
     @Id
     @Column(name="loanpay_id")
     int loanPayId;
     @OneToOne
     @JoinColumn(name="sanction_load_id")
     SanctionedLoans sanctionedLoan;
     
}
