import { Component, OnInit } from '@angular/core';
import { SanctionedLoansService } from '../../Services/sanctioned-loans.service';
import { SanctionedLoans } from '../../Dto/sanctioned-loans';

@Component({
  selector: 'app-getallsanctioned',
  templateUrl: './getallsanctioned.component.html',
  styleUrls: ['./getallsanctioned.component.css']
})
export class GetallsanctionedComponent implements OnInit {
  sanctionedLoansList:SanctionedLoans[];
  constructor(private sanctionedLoansService:SanctionedLoansService) { }

  ngOnInit(): void {
  }
  public getAllSanctionedLoans():void
    {
       this.sanctionedLoansService.getAllSanctionedLoans().subscribe(data => {this.sanctionedLoansList=data;console.log(data)});
    }
}
