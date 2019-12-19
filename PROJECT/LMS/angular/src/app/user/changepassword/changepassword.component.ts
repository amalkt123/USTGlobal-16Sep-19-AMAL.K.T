import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-changepassword',
  templateUrl: './changepassword.component.html',
  styleUrls: ['./changepassword.component.css']
})
export class ChangepasswordComponent implements OnInit {
message;
  constructor(private service:UserService) { }
  changePassword(form: NgForm){
   const data = JSON.parse(localStorage.getItem('user'));
   console.log(data);
    let ids=data.loginBean.id;
    console.log(data);
    this.service.changePassword(ids,form.value.newpassword).subscribe((data)=>{
      console.log(data);this.message=data.description;
    },(err)=>{
      console.log(err);
    })


  }
  ngOnInit() {
  }

}
