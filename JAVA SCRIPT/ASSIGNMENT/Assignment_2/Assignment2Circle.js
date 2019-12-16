console.log("IT'S FOR CIRCUMFERENCE OF THE CIRCLE");
console.log("FUNCTION 1");
var c = num => {
    console.log("Circumference of the Circle..:", 2 * 3.14 * num);
}
var r1 = prompt("Enter a Radius ");
c(r1);

console.log("FUNCTION 2");
function c2(num) {
    console.log("Circumference of the Circle..:", 2 * 3.14 * num);
}
var r2 = prompt("Enter a Radius ");
c2(r2);

console.log("FUNCTION 3")
var c3 = function (num) {
    console.log("Circumference of the Circle..:", 2 * 3.14 * num);
}
var r3 = prompt("Enter a Radius ");
c3(r3);

console.log("FUNCTION 4");
(
    function (num) {
        console.log("Circumference of the Circle..:", 2 * 3.14 * num);
    }
)
//  var r3 = prompt("Enter a Radius ");
//  (r3);
(5);