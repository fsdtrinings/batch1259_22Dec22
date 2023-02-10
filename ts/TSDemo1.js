"use strict";
exports.__esModule = true;
var name = "Ramesh Kumar";
var salary = 2000;
console.log("Name is " + name);
console.log("name is ".concat(name, " and salary ").concat(salary + 15));
// ----------------------------------------------------------
// in java 
// int x = 10;
// var x = 10 ; x = "ramesh kumar";
// declaring variable in typescript
var salary2 = 2000;
// Employee e ;
// let e : Employee;
// ----- creation of Arrays ------
var arr = [15, 16, 17]; // in java script 
var arr2 = [15, 16, 17]; // approach 1 
// TypeScript (ES6 Standards)
var arr3 = [15, 16, 17]; // approach 2
var arr4 = ['java', 'python']; // approach 2
console.log(arr2 + " - " + arr3 + " - " + arr4);
console.log("\n");
arr2 = arr2.concat(arr3);
console.log(arr2);
// ----- working with functions ------
//    doStuff(int x,int y)
function doStuff(a, b) 
{
    if (b === void 0) 
    { b = 100; }
    console.log("inside doStuff " + (a + b));
}
doStuff(15);
