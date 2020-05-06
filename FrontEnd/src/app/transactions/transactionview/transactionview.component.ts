import { Component, OnInit } from '@angular/core';
import { TransService } from '../Services/trans.service';

@Component({
  selector: 'app-transactionview',
  templateUrl: './transactionview.component.html',
  styleUrls: ['./transactionview.component.css']
})
export class TransactionviewComponent implements OnInit {
  message:String;
  constructor(private transService:TransService) { }

  ngOnInit(): void 
  {
    this.transService.amount$.subscribe(msg => this.message = msg);
  }

}
