import { Injectable } from '@angular/core';
import {Subject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ViewService {
  private loanSource = new Subject<String>();
  loan$ = this.loanSource.asObservable();
  constructor() { }
  public sendMessage(message:String): void
  {
     this.loanSource.next(message);
  }
}
