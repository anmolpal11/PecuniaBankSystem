import { Address } from './address';
export class Customer
{
    customerId:number;
    customerName:String;
    customerPAN:String;
    address:Address = new Address();
    phone:number;
    emailId:String;
    aadharNo:number;
    public constructor()
    {
    }
}
