const Message=new Promise(function(resolve,reject){
    if(30>20){
        resolve("success");
    }
    else{
        reject("failed");
    }
})
//resolve and reject we can give any name it is a parameter as function

console.log(Message);
console.log("=============================");

Message.then(function(msg){
    console.log("resolve method paramater  "+msg)
}).catch(function(err){
    console.log("reject method parameter ",err)
});


const Traine=new Promise(function(resolve,reject){
    if(30>20){
        resolve([{name:"amal",age:23},{name:"jison",age:22},{name:"harsha",age:20}]);
    }
    else{
        reject("failed");
    }
})
//resolve and reject we can give any name it is a parameter as function

console.log(Message);
console.log("=============================");

Traine.then(function(msg){
    console.log("resolve method paramater  ",msg)
}).catch(function(err){
    console.log("reject method parameter ",err)
});









console.log("only  catch")
Message.catch(function(err){
    console.log(err);
})

console.log("only then")
Message.then(function(msg){
    console.log(msg)
})








console.log("function inside another function")

//clasuse
console.log("clause");

function outerFunction(counter){
    function innerFunction(){
        let count;
        count=counter+10;
        return count;
        l
    }
    return innerFunction;
}
let innerFunc=outerFunction(10);
let counter=innerFunc();
console.log(counter);





