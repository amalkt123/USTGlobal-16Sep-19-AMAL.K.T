console.log("IT'S FOR PRIME..: ");

console.log("FUNCTION 1");
var prime1 = num => {
    if(num%2 != 0)
    console.log("It's NOt Prime..");
    else
    console.log("It's Prime");
}
var n1 = prompt("Enter to find a it's Prime or Not..:");
prime1(n1);

console.log("FUNCTION 2");
var Prime2 = function(num){
    if(num%2 != 0)
    console.log("It's NOt Prime..");
    else
    console.log("It's Prime");
}
var n2 = prompt("Enter to find a it's Prime or Not..:");
prime1(n2);

console.log("FUNCTION 3");
function prime3(num){
    if(num%2 != 0)
    console.log("It's NOt Prime..");
    else
    console.log("It's Prime");
}
var n3 = prompt("Enter to find a it's Prime or Not..:");
prime1(n3);

console.log("FUNCTION 4");
(
    function(num)
    {
        if(num%2 != 0)
        console.log("It's NOt Prime..");
        else
        console.log("It's Prime");
    }
)
(5);
// var n4 = prompt("Enter to find a it's Prime or Not..:");
// (n4);