import {Account} from './Account';
import {Cheque} from '../Dto/cheque'
export class Transaction
{
  transId:number;
  transactionDate:Date;
  transactionType:String;
  transactionAmount:number;
  slipNo:number;
  chequeDetails:Cheque;
  account:Account;
  
}
