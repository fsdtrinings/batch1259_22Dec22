export{}

interface Student
{
    name:string,
    marks:number,
    age:number
}

let s1:Student = {
    name:"Ramesh Kumar",
    marks:90,
    age:20
}
let s2:Student = {
    name:"Suresh Kumar",
    marks:70,
    age:21
}
let s3:Student = {
    name:"Mahesh Kumar",
    marks:85,
    age:21
}

let allStudents:Array<Student> = [s1,s2,s3];

allStudents.forEach(s=>{
    console.log(s);
    
});
console.log("\n\n");

allStudents.forEach(s=>{
    if(s.marks>75)
    {
        console.log(s);
        
    }
});

