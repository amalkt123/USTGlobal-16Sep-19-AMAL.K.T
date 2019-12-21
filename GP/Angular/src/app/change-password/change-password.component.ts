import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-change-password',
  templateUrl: './change-password.component.html',
  styleUrls: ['./change-password.component.css']
})
export class ChangePasswordComponent implements OnInit {
  passwordCheck;
  cpasswordCheck;
  check;
  constructor(private service:ServiceService) { }
  changePassword(form){
    console.log(form.value);
    this.service.changePassword(form.value);
  }
  passwords(event){

    this.passwordCheck=event.target.value;

  }
  cPassword(event){
    
    this.cpasswordCheck=event.target.value;
    if(this.passwordCheck===this.cpasswordCheck){
         this.check=false;
         console.log(false);
    }
    else{
      console.log(true)
      this.check=true;
    }
  }

  ngOnInit() {
  }

}
