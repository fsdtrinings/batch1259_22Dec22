export{}
let name = "Ramesh Kumar";
let salary = 2000;
console.log("Name is "+name);
console.log(`name is ${name} and salary ${salary+15}`);
// ----------------------------------------------------------

// in java 
// int x = 10;
// var x = 10 ; x = "ramesh kumar";

// declaring variable in typescript
let salary2 : number = 2000;
// Employee e ;
// let e : Employee;


// ----- creation of Arrays ------
var arr = [15,16,17]; // in java script 
let arr2:number[] = [15,16,17]; // approach 1 

// TypeScript (ES6 Standards)
let arr3: Array<number> = [15,16,17];  // approach 2
let arr4: Array<string> = ['java','python'];  // approach 2
console.log(arr2+" - "+arr3+" - "+arr4);
console.log("\n");
arr2 = arr2.concat(arr3);
console.log(arr2);
arr2.push(888);
console.log(arr2);



// ----- working with functions ------
//    doStuff(int x,int y)
function doStuff(a : number,b : number = 100)
{
    console.log("inside doStuff "+(a+b));
    
}
doStuff(15);



