var brands=["kingfisher","bisleri","aqua","kinley"];
console.log("for of loop");

for(var element of brands){
    console.log("Brand=",element);
}
console.log("====================================");

console.log("for in loop")

for(var index in brands){
    console.log("brands=",brands[index]);
}
console.log("===================================");
console.log("for in loop in object")
var person={
    name:"sundari",
    age:33,
    color:"white"
}
for(var key in person)
{
    console.log(key+"===>"+person[key]);
}

for(var key in person)
{
    console.log(key+"===>"+person.key);
}


console.log("foreach function for array it is an non static array function");

var movie=['sholay',`mayabazar`,'titanic'];
movie.forEach(element=value => {
console.log("movie=",value);
    
});



console.log("=================================");
movie.forEach(function(value,index){
    console.log("movie=",index,"=",value)


})









console.log("array condain object");



var items=[{
    item:'bangles', id:1, price:100},{
    item:"eyeliner",id:2,price:500},
{   item:"watch",id:3,price:500},
{item:"bike",id:4,price:100000}]



items.forEach(function(value,index) {
    for(var key in value){
        console.log(key,'=',value[key])
    }
    console.log("=============");
    console.log(value)
    
});