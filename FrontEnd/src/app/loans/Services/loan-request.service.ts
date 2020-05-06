import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LoanRequest } from '../Dto/loan-request';
import { Injectable } from '@angular/core';
@Injectable({
   providedIn:'root'
})
export class LoanRequestService
{
   public constructor(private httpClient:HttpClient){ }
   
   public getLoanRequest(requestId:number)  : Observable<LoanRequest>     
   {
      return this.httpClient.get<any>('http://localhost:8090/getLoanRequest/'+requestId);
      
   }
   public getAllLoanRequest() : Observable<LoanRequest[]>
   {
      return this.httpClient.get<LoanRequest[]>('http://localhost:8090/getAllLoanRequest');
   }
   public insertLoanRequest(loanRequest:LoanRequest) : Observable<String>
   {
       return this.httpClient.post<String>('http://localhost:8090/insertLoanRequest',loanRequest,{responseType:'text' as 'json'});
   }
   
   public deleteLoanRequest(requestId:number) : Observable<String>
   {
       return this.httpClient.delete<String>('http://localhost:8090/deleteLoanRequest/'+requestId,{responseType:'text' as 'json'});
   }

} 