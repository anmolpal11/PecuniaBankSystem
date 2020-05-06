import { Component, OnInit,ViewChild,Input} from '@angular/core';
import {Transaction} from '../Dto/transaction';
import {UpdateComponent} from '../update/update.component';
import {PassService} from '../Services/pass.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit 
{
  trans:Transaction[]= [];
  constructor(private passService:PassService) { }
  ngOnInit(): void 
  {
  	this.passService.transaction$.subscribe(data => {
							for(var t of data)
							{
							  console.log(t);
							  this.trans.push(t);
							}
							});
  }
}
