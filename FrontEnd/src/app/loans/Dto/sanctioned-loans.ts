import { Customer } from './customer';
import { Loans } from './loan';
export class SanctionedLoans
{
    sanctionId:number;
	customer:Customer = new Customer();
	loan:Loans = new Loans();
	sanctionedAmount:number;
	loanEmi:number;
	loanTenure:number;
	loanIssuedDate:Date;
	status:String;
	public constructor() 
	{
	}
}