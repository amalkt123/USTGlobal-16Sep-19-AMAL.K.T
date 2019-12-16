console.log("IT'S  FOR FIB");

console.log("FUNCTION 1");
var f = (num1) => {
    var i=0, j=0, z=1;
    console.log(j);
    console.log(z);
     while(true)
     {
         i=j+z;
         if(i>=num1)
         {
             break;
         }
         j=z;
         z=i;
         console.log(i);
     }
}
var n1 = prompt("Enter no for Fib");
f(n1);

console.log("FUNCTION 2");
function f1(num1){
    var i=0, j=0, z=1;
    console.log(j);
    console.log(z);
     while(true)
     {
         i=j+z;
         if(i>=num1)
         {
             break;
         }
         j=z;
         z=i;
         console.log(i);
     }
}
var n2 = prompt("Enter no for Fib");
f1(n2);
console.log("FUNCTION 3");
var f3 = function(num1){
    var i=0, j=0, z=1;
    console.log(j);
    console.log(z);
     while(true)
     {
         i=j+z;
         if(i>=num1)
         {
             break;
         }
         j=z;
         z=i;
         console.log(i);
     }
}
var n3 = prompt("Enter no for Fib");
f3(n3);
console.log("FUNCTION 4 ");

(
    function(num1){4
        var i=0, j=0, z=1;
    console.log(j);
    console.log(z);
     while(true)
     {
         i=j+z;
         if(i>=num1)
         {
             break;
         }
         j=z;
         z=i;
         console.log(i);
     }
    }
)
// var n4 = prompt("Enter no for Fib");
// (n4);
(4);