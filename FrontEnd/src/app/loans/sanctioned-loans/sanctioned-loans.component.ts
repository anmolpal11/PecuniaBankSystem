import { Component, OnInit } from '@angular/core';
import { SanctionedLoansService } from '../Services/sanctioned-loans.service';
@Component({
  selector: 'app-sanctioned-loans',
  templateUrl: './sanctioned-loans.component.html',
  styleUrls: ['./sanctioned-loans.component.css']
})
export class SanctionedLoansComponent implements OnInit 
{
   public constructor(private sanctionedLoansService:SanctionedLoansService){}   
  ngOnInit(): void {
  }

}
