import { Component, OnInit } from '@angular/core';
import { DepositerService } from '../../Services/depositerservice';

@Component({
  selector: 'app-messageview',
  templateUrl: './messageview.component.html',
  styleUrls: ['./messageview.component.css']
})
export class MessageviewComponent implements OnInit {
  message:String;
  constructor(private depositersService:DepositerService) { }

  ngOnInit(): void 
  {
    this.depositersService.message$.subscribe(data => this.message = data);
  }

}
