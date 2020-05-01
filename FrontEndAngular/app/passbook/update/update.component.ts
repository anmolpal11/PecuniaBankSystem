import { Component, OnInit } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {PassbookService} from '../Services/passbook.service';
import {Transaction} from '../Dto/transaction';
import {Router} from '@angular/router';
import {PassService} from '../Services/pass.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit 
{
  accId:number;
  transId:number;
  bool:boolean = false;
  constructor(private passbookService:PassbookService,private router:Router,private passService:PassService) { }

  ngOnInit(): void {
  }
  public getPassbookUpdates():void
  {
     this.passbookService.getPassbookUpdates(this.accId,this.transId).subscribe( data => {
								this.passService.sendTransactions(data.transactions);console.log(data)
			});
     this.router.navigate(['view']);
  }
}
