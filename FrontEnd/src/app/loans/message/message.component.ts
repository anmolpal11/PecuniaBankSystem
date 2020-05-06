import { Component, OnInit } from '@angular/core';
import { ViewService } from '../Services/view.service';

@Component({
  selector: 'app-message',
  templateUrl: './message.component.html',
  styleUrls: ['./message.component.css']
})
export class MessageComponent implements OnInit {
  message:String;
  constructor(private viewService:ViewService) { }

  ngOnInit(): void
  {
    this.viewService.loan$.subscribe(data => this.message = data);
  }

}
