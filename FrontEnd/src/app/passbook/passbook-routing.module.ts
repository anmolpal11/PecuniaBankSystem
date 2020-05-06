import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UpdateComponent } from './update/update.component';
import { SummaryComponent } from './summary/summary.component';
import {ViewComponent} from './view/view.component';

const routes: Routes = [
                      {path:'update',component:UpdateComponent},
                      {path:'summary',component:SummaryComponent},
                      {path:'view',component:ViewComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class PassbookRoutingModule { }
