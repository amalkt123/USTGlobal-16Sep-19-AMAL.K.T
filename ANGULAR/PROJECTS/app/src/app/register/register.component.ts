import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit,DoCheck,AfterViewInit,AfterViewChecked,OnDestroy{
  users;
  selecteduser;
  today=new Date();

  constructor(public service:UserService) {
    this.getData();
    console.log("constructor is executed");
   }
  loginData(form:NgForm){
    console.log(form);
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data=>{
      console.log(data);
    },err=>{
      console.log(err);
    },()=>{
      console.log("data posted successfully");
    });
  }


  getData(){
    this.service.getUser().subscribe(data=>{
      console.log(data);
    this.users=data;},err=>{
        console.log(err);},()=>{
          console.log("data get successfully");})
        }



        deleteData(user){
          console.log(user);
          this.service.deleteUser(user.id).subscribe(data=>{
            console.log(data);},
            err=>{console.log(err);},
            ()=>{console.log("data deleted successfully");});
}



selectUser(user){
  console.log(user);
  this.selecteduser=user;
  console.log(this.selecteduser);
  console.log(this.selecteduser);
}





updateData(form){
  console.log("update",form.value);
  this.service.updateUser(form.value.id,form.value).subscribe(data=>{
    console.log(data);},
    err=>{console.log(err)},
    ()=>{console.log("data updated successfully");});
}


ngOnInit(){
  console.log("ng oninit is eecuted");
}
ngDoCheck(){
  console.log("ng dochek is executed");
}  
ngAfterViewInit(){
  console.log("after view init is executed");
}
ngAfterViewChecked(){
  console.log('after view checked is executed');
}
ngOnDestroy(){
  console.log("ng distroy executed");
}
}

