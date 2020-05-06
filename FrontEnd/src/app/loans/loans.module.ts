import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoansComponent } from './loans.component';
import { LoansRoutingModule } from './loans-routing.module';
import { LoanComponent } from './loan/loan.component';
import { LoanRepaymentComponent } from './loan-repayment/loan-repayment.component';
import { LoanRequestComponent } from './loan-request/loan-request.component';
import { SanctionedLoansComponent } from './sanctioned-loans/sanctioned-loans.component';
import { FormsModule } from '@angular/forms';
import { ShowloanComponent } from './loan/showloan/showloan.component';
import { AllloanComponent } from './loan/allloan/allloan.component';
import { ShowsanctionedComponent } from './sanctioned-loans/showsanctioned/showsanctioned.component';
import { GetallsanctionedComponent } from './sanctioned-loans/getallsanctioned/getallsanctioned.component';
import { MessageComponent } from './message/message.component';
import { ShowallrequestsComponent } from './loan-request/showallrequests/showallrequests.component';



@NgModule({
  declarations: [LoansComponent,LoanComponent,LoanRepaymentComponent,LoanRequestComponent,SanctionedLoansComponent, ShowloanComponent, AllloanComponent, ShowsanctionedComponent, GetallsanctionedComponent, MessageComponent, ShowallrequestsComponent],
  imports: [
    CommonModule,LoansRoutingModule,FormsModule
  ]
})
export class LoansModule { }
