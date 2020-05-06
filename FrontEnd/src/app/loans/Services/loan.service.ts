import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Loans } from '../Dto/loan';
import { Injectable } from '@angular/core';
@Injectable({
   providedIn:'root'
})
export class LoanService
{
   public constructor(private httpClient:HttpClient){ }
   
   public getLoans(loanId:number)  : Observable<Loans>     
   {
      return this.httpClient.get<any>('http://localhost:8090/getLoans/'+loanId);
      
   }
   public getAllLoans() : Observable<Loans[]>
   {
      return this.httpClient.get<Loans[]>('http://localhost:8090/getAllLoans');
   }
   public insertLoans(loan:Loans) : Observable<String>
   {
       return this.httpClient.post<String>('http://localhost:8090/insertLoans',loan,{responseType:'text' as 'json'});
   }
   
   public deleteLoans(loanId:number) : Observable<String>
   {
       return this.httpClient.delete<String>('http://localhost:8090/deleteLoans/'+loanId,{responseType:'text' as 'json'});
   }

} 