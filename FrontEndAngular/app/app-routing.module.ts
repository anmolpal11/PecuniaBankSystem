import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PassbookComponent } from './passbook/passbook.component';
import { TransactionsComponent } from './transactions/transactions.component';
import { FixeddepositsComponent } from './fixeddeposits/fixeddeposits.component';

const routes: Routes = [
                      {path:'passbook',component:PassbookComponent},
                      {path:'transactions',component:TransactionsComponent},
                      {path:'fixeddeposits',component:FixeddepositsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
