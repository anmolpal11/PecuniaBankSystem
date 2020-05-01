import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PassbookService
 {

  constructor(private httpClient:HttpClient) { }
  public getPassbookUpdates(accId:number,transId:number) : Observable<any>
  {
     return this.httpClient.get<any>('http://localhost:8090/passbookUpdate/accountNo/'+accId+'/lasttransaction/'+transId);
  }
  public getAccountSummary(accId:number,startDate:String,endDate:String) : Observable<any>
  {
    return this.httpClient.get<any>('http://localhost:8090/accountSummary/accountNo/'+accId+'/startDate/'+startDate+'/endDate/'+endDate);
  }
}
