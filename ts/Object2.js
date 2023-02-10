"use strict";
exports.__esModule = true;
var s1 = {
    name: "Ramesh Kumar",
    marks: 90,
    age: 20
};
var s2 = {
    name: "Suresh Kumar",
    marks: 70,
    age: 21
};
var s3 = {
    name: "Mahesh Kumar",
    marks: 85,
    age: 21
};
var allStudents = [s1, s2, s3];
allStudents.forEach(function (s) {
    console.log(s);
});
console.log("\n\n");
allStudents.forEach(function (s) {
    if (s.marks > 75) {
        console.log(s);
    }
});
