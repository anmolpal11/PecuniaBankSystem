import { Injectable } from '@angular/core';
import {Subject} from 'rxjs';
import { FixedDepositHolders } from '../Dto/fixeddepositholders';

@Injectable({
  providedIn: 'root'
})
export class DepositerService {
  private depositsSource = new Subject<FixedDepositHolders>();
  deposits$ = this.depositsSource.asObservable();
  private messageSource = new Subject<String>();
  message$ = this.messageSource.asObservable();
  constructor() { }
  public sendTransactions(fixedDepositHolders:FixedDepositHolders): void
  {
     this.depositsSource.next(fixedDepositHolders);
  }
  public sendMessage(message:String) : void
  {
     this.messageSource.next(message);
  }
}