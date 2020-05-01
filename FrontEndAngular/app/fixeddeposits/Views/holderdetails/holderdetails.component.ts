import { Component, OnInit } from '@angular/core';
import { FixedDepositHolders } from '../../Dto/fixeddepositholders';
import {DepositerService} from '../../Services/depositerservice';
@Component({
  selector: 'app-holderdetails',
  templateUrl: './holderdetails.component.html',
  styleUrls: ['./holderdetails.component.css']
})
export class HolderdetailsComponent implements OnInit {
  fixedDepositHolders:FixedDepositHolders = new FixedDepositHolders();
  constructor(private depositerService:DepositerService) { }

  ngOnInit(): void
  {
    this.depositerService.deposits$.subscribe(data => this.fixedDepositHolders = data);
  }

}
