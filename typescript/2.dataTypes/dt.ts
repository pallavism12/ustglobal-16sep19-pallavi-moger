let a:string="Ashwini";
console.log(a);
let b=20;
console.log(20);
let c:number;
console.log(c);
let d;
d="sdfsdfs";
d=2343434;
console.log(d);
let e=function():void{
console.log("hi")}
e();
class person{
    constructor(public name:string,public age:number){
          name="bd"
    }
}
let details=new person("Madhu",22);
console.log(details);
class student extends person{
    constructor(name:string,age:number,public rno:number)
    {
      super(name,age);
    }
}
let sdetails=new student("Acchu",21,120)
console.log(sdetails);