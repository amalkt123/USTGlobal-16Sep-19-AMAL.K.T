let element=document.getElementById("demo");
console.log("element= ",element);
console.log("element text =",element.textContent);
element.textContent="hello amal";
let buttonElement=document.createElement('button');
buttonElement.textContent="click me";
console.log("button element",buttonElement);
document.body.appendChild(buttonElement);
let ulElement=document.createElement('ul');
let li1Element=document.createElement('li');
let li2Element=document.createElement('li');
let li3Element= document.createElement('li');


li1Element.textContent="java";
li2Element.textContent="sql";
li3Element.textContent="python"

ulElement.appendChild(li1Element);
ulElement.appendChild(li2Element);
ulElement.appendChild(li3Element);
document.body.appendChild(ulElement);

ulElement.style.color="red";
ulElement.style.fontSize="20px";

function showMessage(){
    alert("mouse event onclick");
}

function changeColor(){
let el=document.getElementById("mover");
el.style.color="green";

}

function removeColor(){
    let el=document.getElementById("mover");
    el.style.color="red";
    
    }
    function printHello(){
        let uname=document.getElementById("userName").value
        document.getElementById("showUsername").textContent=uname;
        console.log("on key up hello")
    }

    let name='rakesh'
    let age=21
    let pno=749999881144
    console.log('name is'+name+'age'+age+"phone no"+pno)
    console.log(`name is${name} age is${age} phone no is${pno}`);
    console.log(`2+2${2+2}`)
//document.getElementById().diabled=false;