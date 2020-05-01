import { Customer } from './customer';
import { FixedDeposits } from './fixeddeposits';

export class FixedDepositHolders
{
    depositHolderId:number;
    customer:Customer = new Customer();
    depositDetails:FixedDeposits = new FixedDeposits();
    amount:number;
    depositedDate:Date;
}