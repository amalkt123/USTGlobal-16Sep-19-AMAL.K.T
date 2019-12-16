console.log("WAY_1 DATATYPE");
let myName : string = 'ABC';
console.log(myName,typeof myName);
console.log("WAY_2 DATATYPE");
let num : number;
console.log(num,typeof num);
console.log("WAY_3 DATATYPE");
let num1 = 29;
console.log(num,typeof num);
console.log("WAY_4 DATATYPE");
let address;
console.log(address,typeof address);
address = "XYZ";
console.log(address,typeof address);
address = 22;
console.log(address,typeof address);


let calAge = function() : void {
    console.log("Age_is_29");
}
calAge();


console.log("Its for Class & inhertance");


class SuperClass{
    constructor(public name : string, public age : number){
        //console.log();
    }
}
let supclss = new SuperClass("ABC",29);
console.log(supclss);

class SubClass extends SuperClass{
    constructor(name ,age,public rollNo : number ){
        super(name ,age);
    }
}

let subclss = new SubClass("BCA",28,25);
console.log(subclss);