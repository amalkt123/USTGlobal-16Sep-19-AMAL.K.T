window.console.log("with window key word");
this.console.log("this key word");
console.log("with out window key word")

console.log("window",window);
console.log('this',this);
console.log(window===this);
window.alert("welcome to java script class")
alert("welcome to ust global and testyantra");

let confirmDelete=confirm("are you want to delete")
console.log("confirm delete = ",confirmDelete);
let username=promp("what is your name",'amal')
console.log("name",username);
let uname=prompt("enter your name")
console.log(uname);
//this keyword exceptional one case
const person={
    firstname:"alia",
    age:26,
    lastname:'kapoor',
    getName:function(){
        console.log("this keyword",this)
        console.log("this keyword",this.firstname)
        console.log("this keyword",this.lastname)
        console.log("this keyword",this.age)
        return this.firstname+" "+this.lastname;
    }
}
let fullname=person.getName();
console.log("full name",fullname);