import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FixeddepositsComponent } from './fixeddeposits.component';
import { AddfixeddepositComponent } from './addfixeddeposit/addfixeddeposit.component';
import { SearchfixeddepositComponent } from './searchfixeddeposit/searchfixeddeposit.component';
import { FixedDepositsRoutingModule} from './fixeddeposits-routing.module';
import { MessageviewComponent } from './Views/messageview/messageview.component';
import { HolderdetailsComponent } from './Views/holderdetails/holderdetails.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [FixeddepositsComponent, AddfixeddepositComponent, SearchfixeddepositComponent, MessageviewComponent, HolderdetailsComponent],
  imports: [
    CommonModule,FixedDepositsRoutingModule,FormsModule
  ]
})
export class FixeddepositsModule { }
