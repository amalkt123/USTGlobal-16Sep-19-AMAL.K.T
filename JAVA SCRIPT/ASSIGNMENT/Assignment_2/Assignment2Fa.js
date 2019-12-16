console.log("FUNCTION 1");
var a1 = num =>{
    var temp1 = 1;
    for(var i = num; i>0; i--)
    {
        temp1 = temp1 * i;
    }
    return temp1;
}
var n1 = prompt("Enter a FACTORIAL Number for FUN 1 : ");
console.log("FACTORIAL = ", a1(n1));

console.log("FUNCTION 2");
function a2(num){
    var temp1 = 1;
    for(var i = num; i>0; i--)
    {
        temp1 = temp1 * i;
    }
    return temp1;  
}
var n2 = prompt("Enter a FACTORIAL Number for FUN 2: ");
console.log("FACTORIAL = ", a2(n2));

console.log("FUNCTION 3");
var a3 = function(num)
{
    var temp1 = 1;
    for(var i = num; i>0; i--)
    {
        temp1 = temp1 * i;
    }
    return temp1;   
}
var n3 = prompt("Enter a FACTORIAL Number for FUN 3: ");
console.log("FACTORIAL = ", a3(n3));

console.log("FUNCTION 4");
(
    function(num)
    {
        var temp1 = 1;
    for(var i = num; i>0; i--)
    {
        temp1 = temp1 * i;
    }
    console.log("FACTORIAL = ",temp1);
    }
)
(5);
// var n4 = prompt("Enter a FACTORIAL Number for FUN 3: ");
// var v = (n4);
// console.log("FACTORIAL = ", v);

