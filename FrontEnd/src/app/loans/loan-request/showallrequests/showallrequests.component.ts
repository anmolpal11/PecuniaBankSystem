import { Component, OnInit } from '@angular/core';
import { LoanRequest } from '../../Dto/loan-request';
import { LoanRequestService } from '../../Services/loan-request.service';

@Component({
  selector: 'app-showallrequests',
  templateUrl: './showallrequests.component.html',
  styleUrls: ['./showallrequests.component.css']
})
export class ShowallrequestsComponent implements OnInit {
  loanRequestList:LoanRequest[];
  constructor(private loanRequestService:LoanRequestService) { }

  ngOnInit(): void
  {
  }
  public getAllLoanRequest():void
  {
     this.loanRequestService.getAllLoanRequest().subscribe(data => this.loanRequestList=data);
  }
}
