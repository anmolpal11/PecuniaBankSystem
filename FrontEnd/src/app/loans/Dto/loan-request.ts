import { Loans } from './loan';
import { Customer } from './customer';
export class LoanRequest
{
	customer:Customer = new Customer();
    requestId:number;
	requestDate:Date;
	customerIncome:number;
	loan:Loans = new Loans();
	status:String;
	public constructor() 
	{
	}
}