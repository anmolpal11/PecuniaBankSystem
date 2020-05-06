import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import {PassbookModule} from './passbook/passbook.module';
import { HomeComponent } from './home/home.component';
import { TransactionsModule } from './transactions/transactions.module';
import { FixeddepositsModule } from './fixeddeposits/fixeddeposits.module';
import { AccountModule } from './account/account.module';
import {LoansModule} from './loans/loans.module';

@NgModule({
  declarations: [
    AppComponent,HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule,PassbookModule,TransactionsModule,FixeddepositsModule,AccountModule,LoansModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
