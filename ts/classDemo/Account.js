"use strict";
exports.__esModule = true;
exports.Account = void 0;
var Account = /** @class */ (function () {
    function Account(accountName, balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
    Account.prototype.getBalance = function () {
        return this.balance;
    };
    Account.prototype.updateInterest = function () {
        this.balance *= 1.03;
    };
    return Account;
}());
exports.Account = Account;
