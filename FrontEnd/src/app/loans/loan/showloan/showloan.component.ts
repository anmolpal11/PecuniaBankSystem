import { Component, OnInit } from '@angular/core';
import { LoanService } from '../../Services/loan.service';
import { Loans } from '../../Dto/loan';
import { ViewService } from '../../Services/view.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-showloan',
  templateUrl: './showloan.component.html',
  styleUrls: ['./showloan.component.css']
})
export class ShowloanComponent implements OnInit {
  loan:Loans = new Loans();
  constructor(private loanService:LoanService,private viewService:ViewService,private router:Router) { }

  ngOnInit(): void {
  }
  public getLoans():void
   {
       this.loanService.getLoans(this.loan.loanId).subscribe(data => this.loan=data );
   }
   public deleteLoans() : void
   {
      this.loanService.deleteLoans(this.loan.loanId).subscribe(data => this.viewService.sendMessage(data));
      this.router.navigate(['loanmessage']);
   }

   public insertLoans():void
   {
       this.loanService.insertLoans(this.loan).subscribe(data => this.viewService.sendMessage(data));
       this.router.navigate(['loanmessage']);
   }
}
