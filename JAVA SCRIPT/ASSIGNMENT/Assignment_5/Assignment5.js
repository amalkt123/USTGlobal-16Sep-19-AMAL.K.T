
function viewPrss()
{
  let elementPass = document.getElementById('pass');
  if(elementPass.type === 'password')
  {
    elementPass.type = 'text';
  }
  else{
    elementPass.type = 'password';
  }
}
function buttonOnClick()
{
 let elementUn = document.getElementById('name').value;
 let elementPass = document.getElementById('pass').value;
 let eleUnTrim = elementUn.trim();
 let elePassTrim = elementPass.trim();
 if(eleUnTrim.length < 5 || elePassTrim < 8) 
 {
   alert("check ur username & password..");
 }
 else{
   alert("sumbit done..");
 }
}

// function disableFun(){
let elementUn1 = document.getElementById('name').value;
let elementPass2 = document.getElementById('pass').value;
let eleUnTrim1 = elementUn1.trim();
let elePassTrim2 = elementPass2.trim();
if(eleUnTrim1.length > 5 && elePassTrim2.length > 8)
{
  // console.log("True");
  // document.getElementById('b1').disabled = false;
  let y = document.getElementById('b1').disabled=false;
  // document.getElementById('demo').innerHTML=y;
}
else{
  // console.log("false");
  // document.getElementById('b1').disabled = true;
  document.getElementById('b1').disabled=true;
  // document.getElementById('demo').innerHTML=y;
// }
// document.getElementById('b1').disabled = false;
}