import {Account} from './Account'

let a1:Account = new Account("Ramesh",2000);
let a2:Account = new Account("Suresh",3000);
let a3:Account = new Account("Mukesh",1500);

console.log(a1);
a1.updateInterest();
console.log(a1);

let accountBalance = a1.getBalance();
console.log("Balance :- "+accountBalance);

