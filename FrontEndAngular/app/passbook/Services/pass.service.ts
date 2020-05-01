import { Injectable } from '@angular/core';
import {Transaction} from '../Dto/transaction';
import {Subject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PassService {
  private transactionsSource = new Subject<Transaction[]>();
  transaction$ = this.transactionsSource.asObservable();
  constructor() { }
  public sendTransactions(transaction:Transaction[]): void
  {
     this.transactionsSource.next(transaction);
  }
}
