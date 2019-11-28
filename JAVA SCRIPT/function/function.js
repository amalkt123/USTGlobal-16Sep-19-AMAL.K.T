//named function

function add(num1,num2){
    console.log('sum = ',num1+num2);
    
}
add(10,20);
add(10)


//functio expression (anonymous function)
var sub = function(num1,num2){
    console.log('sub = ',num1-num2)
    return num1-num2
}
//no concept of function overloading last defined function will call
function add(num1,num2){
    console.log(num1+num2+10);
}
var value1=sub(10,5);
console.log(value1);
var value2=sub(10)
console.log(value2)


//self invoked function
console.log("hello");
(function(num1,num2){
    console.log('sum=',num1+num1)
})(10,20)

//fat arrow function

   var div=(num1,num2)=>{
       console.log("div = ",num1/num2);
   }
   div(10,5);


   //only one parameter
   var mul=num1=>{
       console.log(num1*num1)
   }
   mul(10);
   //only one parameter and one line of code inside
   var adds=num1=>num1+num1;
   var result=adds(20);
   console.log(result)