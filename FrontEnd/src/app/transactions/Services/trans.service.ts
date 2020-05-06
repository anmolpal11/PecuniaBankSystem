import { Injectable } from '@angular/core';
import {Subject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TransService {
  private amountSource = new Subject<String>();
  amount$ = this.amountSource.asObservable();
  constructor() { }
  public sendTransactions(message:String): void
  {
     this.amountSource.next(message);
  }
}
