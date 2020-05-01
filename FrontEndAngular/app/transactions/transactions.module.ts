import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TransactionsComponent } from './transactions.component';
import { CreditComponent } from './credit/credit.component';
import { DebitComponent } from './debit/debit.component';
import { TransactionsRoutingModule } from './transaction-routing.module';
import { SlipcreditComponent } from './slipcredit/slipcredit.component';
import { SlipdebitComponent } from './slipdebit/slipdebit.component';
import { ChequecreditComponent } from './chequecredit/chequecredit.component';
import { ChequedebitComponent } from './chequedebit/chequedebit.component';
import { FormsModule } from '@angular/forms';
import { TransactionviewComponent } from './transactionview/transactionview.component';



@NgModule({
  declarations: [TransactionsComponent, CreditComponent, DebitComponent, SlipcreditComponent, SlipdebitComponent, ChequecreditComponent, ChequedebitComponent, TransactionviewComponent],
  imports: [
    CommonModule,TransactionsRoutingModule,FormsModule
  ]
})
export class TransactionsModule { }
