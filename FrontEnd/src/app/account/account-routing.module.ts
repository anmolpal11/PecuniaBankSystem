import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ShowAccountComponent } from './show-account/show-account.component';
import { AddAccountComponent } from './add-account/add-account.component';
import { MessageComponent } from './Message/message/message.component';

const routes: Routes = [
    {path:'showacc',component:ShowAccountComponent},
    {path:'addacc',component:AddAccountComponent},
    {path:'messages',component:MessageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AccountRoutingModule { }
