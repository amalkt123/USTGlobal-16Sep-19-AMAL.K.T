import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  password;
  cpassword;
  check;
  constructor() { }
  passwords(event){
    this. password=event.target.value;
   }
   cpasswords(event){
     this.cpassword=event.target.value;
     console.log(this.cpassword);
     if(this.password===this.cpassword){
        this.check=false;
     }
     else{
       this.check=true;
     }
     
   }
  ngOnInit() {
  }

}
