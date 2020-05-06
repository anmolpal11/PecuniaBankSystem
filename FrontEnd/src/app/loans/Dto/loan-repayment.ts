import { SanctionedLoans } from './sanctioned-loans';
export class LoanRepayment
{
        loanPayId:number;
        sanctionedLoan:SanctionedLoans = new SanctionedLoans();
        amount:number;
        payDate:Date;
        public constructor()
	    {
	    }
}