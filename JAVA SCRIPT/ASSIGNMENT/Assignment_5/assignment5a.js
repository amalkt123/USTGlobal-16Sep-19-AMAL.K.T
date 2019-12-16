function showpass(){
    let pass=document.getElementById("pass")
    if(document.getElementById("check").type=this.checked){
        pass.setAttribute('type','text');
    }
    else{
        pass.setAttribute('type','password'); 
    }

}