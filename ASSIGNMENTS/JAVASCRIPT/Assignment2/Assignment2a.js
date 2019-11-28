var date=new Date();

//print name of month
var month=date.getMonth();
switch(month){
    case 0:console.log("Jan");break;
    case 1:console.log("feb");break;
    case 2:console.log("mar");break;
    case 3:console.log("apr");break;
    case 4:console.log("may");break;
    case 5:console.log("Jun");break;
    case 6:console.log("Jul");break;
    case 7:console.log("aug");break;
    case 8:console.log("sep");break;
    case 9:console.log("oct");break;
    case 10:console.log("nov");break;
    case 11:console.log("dec");break;

    
}

//print name of day
var day=date.getDay();
switch(day){
    case 0:console.log("sun");break;
    case 1:console.log("mon");break;
    case 2:console.log("tue");break;
    case 3:console.log("wen");break;
    case 4:console.log("thus");break;
    case 5:console.log("fri");break;
    case 6:console.log("sat");break;

    
    

}


//print random number between 1 and 100
console.log((Math.random()*100)+1)


//factorial using named function

function fact(num1){
    fact=1;
    for( i=1;i<=num1;i++){
        var fact=fact*i
    }
    console.log(fact);
}
fact(3);

//factorial using self invoked function
(function(num1){
    fact=1;
    for( i=1;i<=num1;i++){
        var fact=fact*i
    }
    console.log(fact); 
})(4);
//factorial using function expression

var facts=function(num1){
    fact=1;
    for( i=1;i<=num1;i++){
        var fact=fact*i
    }
    console.log(fact);
}
facts(5);
//factorial using fat Arrow function

var fato=(num1)=>{
    fact=1;
    for( i=1;i<=num1;i++){
        var fact=fact*i
    }
    console.log(fact);
}
fato(6);




console.log("fibonnacci");


//fibonnacci using named function

function fibo(num1){
    a=0;b=1;c=0;
    for( i=1;i<=num1;i++){
        console.log(a);0,1
        c=a+b;
        a=b;
        b=c;
       
    }
}
fibo(11);

//fibonacci using self invoked function
(function(num1){
    a=0;b=1;c=0;
    for( i=1;i<=num1;i++){
        console.log(a);0,1
        c=a+b;
        a=b;
        b=c;
       
    }
})(4);
//fibonacci using function expression

var fibos=function(num1){
    a=0;b=1;c=0;
    for( i=1;i<=num1;i++){
        console.log(a);0,1
        c=a+b;
        a=b;
        b=c;
       
    }
}
fibos(5);
//fibonnacci using fat Arrow function

var fabo=(num1)=>{
    a=0;b=1;c=0;
    for(;a<=num1;i++){
        console.log(a);0,1
        c=a+b;
        a=b;
        b=c;
       
    }
}
fabo(6);


//function to add no in to an array and return total

console.log("function to add no in to an array and return total");


//fibonnacci using named function

function fibo(num1){
    a=0;b=1;c=0;
    for( i=1;i<=num1;i++){
        console.log(a);0,1
        c=a+b;
        a=b;
        b=c;
       
    }
}
fibo(11);

//fibonacci using self invoked function
(function(num1){
    a=0;b=1;c=0;
    for( i=1;i<=num1;i++){
        console.log(a);0,1
        c=a+b;
        a=b;
        b=c;
       
    }
})(4);
//fibonacci using function expression

var fibos=function(num1){
    a=0;b=1;c=0;
    for( i=1;i<=num1;i++){
        console.log(a);0,1
        c=a+b;
        a=b;
        b=c;
       
    }
}
fibos(5);
//fibonnacci using fat Arrow function

var fabo=(num1)=>{
    a=0;b=1;c=0;
    for(;a<=num1;i++){
        console.log(a);0,1
        c=a+b;
        a=b;
        b=c;
       
    }
}
fabo(6);

console.log(" function to add number and return total")
//function to add number in an array and return total  using named function

function arrayAdd(num){

var array1=[10,20,30];
array1[array1.length]=num;
var sum=0
for (const iterator of array1) {
      sum+=iterator;
    
}
return sum;

}
var sum=arrayAdd(10)
console.log(sum)


//function to add number in an array and return total self invoked function
console.log((function(num1){
    var array1=[10,20,30];
    array1[array1.length]=num1;
    var sum=0
    for (const iterator of array1) {
          sum+=iterator;
        
    }
    return sum;
    
})(4));
//function to add number in an array and return total function expression

var sumadd=function(num1){
    var array1=[10,20,30];
array1[array1.length]=num1;
var sum=0
for (const iterator of array1) {
      sum+=iterator;
    
}
return sum;

}
var sum1=sumadd(5);
console.log(sum1);
//function to add number in an array and return total fat Arrow function

var sumadd1=(num1)=>{
    var array1=[10,20,30];
    array1[array1.length]=num1;
    var sum=0
    for (const iterator of array1) {
          sum+=iterator;
        
    }
    return sum;
    
}
var sum2= sumadd(6);
console.log(sum2);




console.log("prime");


//prime using named function

function prime(num1){
    var count=0;
    for(i=1;i<num1;i++){
        if(num1%i===0)count++;
    }
    if(count===1)console.log(num1+" is prime")
    else console.log(num1+" is not prime")
}
prime(11);

//prime using self invoked function
(function(num1){
    var count=0;
    for(i=1;i<num1;i++){
        if(num1%i===0)count++;
    }
    if(count===1)console.log(num1+" is prime")
    else console.log(num1+" is not prime")
       
})(4);
//prime using function expression

var primes=function(num1){
    var count=0;
    for(i=1;i<num1;i++){
        if(num1%i===0)count++;
    }
    if(count===1)console.log(num1+" is prime")
    else console.log(num1+" is not prime")
}
primes(5);
//prime using fat Arrow function

var pr=(num1)=>{
    var count=0;
    for(i=1;i<num1;i++){
        if(num1%i===0) count++;
    }
    if(count===1) console.log(num1+" is prime")
    else console.log(num1+" is not prime")
       
    
}
pr(6);




console.log("circumferance of a circle");


//circumferance of circle using named function

function circumferance(num1){
   var cf=2*Math.PI*num1;
   console.log("circumferance of circle",cf);
}
circumferance(11);

//circumferance of circle using self invoked function
(function(num1){
    var cf=2*Math.PI*num1;
   console.log("circumferance of circle",cf);
})(4);
//circumferance of circle using function expression

var cirfer=function(num1){
    var cf=2*Math.PI*num1;
    console.log("circumferance of circle",cf);
}
cirfer(5);
//circumferance of circle using fat Arrow function

var cfc=(num1)=>{
    var cf=2*Math.PI*num1;
    console.log("circumferance of circle",cf);
    
}
cfc(6);


