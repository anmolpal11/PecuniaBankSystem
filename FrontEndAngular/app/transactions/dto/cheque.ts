import { BanksDetails } from './bank';

export class Cheque
{
    chequeId :number;
    chequeNo :number;
    chequeAmount:number;
    chequeDated:Date;
    bank:BanksDetails = new BanksDetails();
    chequeAccountNo:number;
}