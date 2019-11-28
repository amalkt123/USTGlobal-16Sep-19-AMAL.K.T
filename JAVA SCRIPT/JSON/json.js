const person={
    name:"sundari",
    age:100,
    color:"white",
    address:{
        city:"bijapur",
        state:"karnataka",
        pincode:555666
    },
    hobbies:['coding','bird watching','singing']
    }
console.log("java script person object",person);
const jsonobject=JSON.stringify(person);
console.log("json person object ",jsonobject);

let javascriptobject=JSON.parse(jsonobject);
console.log("java script person object after parse  ",javascriptobject);

localStorage.setItem("email","amalkt123@gmail.com");
let lsgetele=localStorage.getItem("email")
console.log("local storage element value  for email   "+lsgetele);
localStorage.clear();