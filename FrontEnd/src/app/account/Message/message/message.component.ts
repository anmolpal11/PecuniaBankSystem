import { Component, OnInit } from '@angular/core';
import { MessageService } from '../../Services/message-service';

@Component({
  selector: 'app-message',
  templateUrl: './message.component.html',
  styleUrls: ['./message.component.css']
})
export class MessageComponent implements OnInit {
  message:String;
  constructor(private messageService:MessageService) { }

  ngOnInit(): void
  {
    this.messageService.account$.subscribe(data => this.message = data);
  }

}
