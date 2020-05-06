import { Customer } from './customer';
export class Account
{
    accountNo:number;
    customer:Customer =new Customer();
    openDate:Date;
    status:String;
    type:String;
    balance:number; 
    public constructor()  
    {
    }
}