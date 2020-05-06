import { Component, OnInit } from '@angular/core';
import { LoanService } from '../../Services/loan.service';
import { Loans } from '../../Dto/loan';

@Component({
  selector: 'app-allloan',
  templateUrl: './allloan.component.html',
  styleUrls: ['./allloan.component.css']
})
export class AllloanComponent implements OnInit {
  loans:Loans[];
  constructor(private loanService:LoanService) { }

  ngOnInit(): void {
  }
  public getAllLoans():void
  {
     this.loanService.getAllLoans().subscribe(data => this.loans=data);
  }
}
