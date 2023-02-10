export class Account
{
    accountName:string;
    balance:number;

    constructor(accountName:string,balance:number)
    {
        this.accountName = accountName;
        this.balance = balance;
    }

    getBalance():number
    {
        return this.balance;
    }

    updateInterest()
    {
        this.balance *= 1.03;
    }

}