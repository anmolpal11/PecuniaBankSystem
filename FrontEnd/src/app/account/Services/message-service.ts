import { Injectable } from '@angular/core';
import {Subject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MessageService {
  private accountSource = new Subject<String>();
  account$ = this.accountSource.asObservable();
  constructor() { }
  public sendMessages(message:String): void
  {
     this.accountSource.next(message);
  }
}
