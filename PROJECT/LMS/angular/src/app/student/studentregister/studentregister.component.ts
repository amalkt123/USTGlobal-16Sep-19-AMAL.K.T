import { Component, OnInit } from '@angular/core';
import { StudentService } from 'src/app/student.service';
import { NgForm, FormGroup, FormControl, Validators } from '@angular/forms';
@Component({
  selector: 'app-studentregister',
  templateUrl: './studentregister.component.html',
  styleUrls: ['./studentregister.component.css']
})
export class StudentregisterComponent implements OnInit {
message;

  constructor(private service: StudentService) { }

   get name(){
     return this.registerForm.get("name");
   }

   get course(){
     return this.registerForm.get("course");
   }

   get batch(){
     return this.registerForm.get("batch");
   }
   get department(){
     return  this.registerForm.get('department');
   }
   get username(){
     return this.registerForm.get('username');
   }
  get password(){
    return this.registerForm.get('password');
  }
  get mob(){
    return this.registerForm.get('mob');
  }








  registerForm=new FormGroup({
 name:new FormControl("",[Validators.required,Validators.pattern('[a-zA-Z]*')]),
 course:new FormControl("",[Validators.required,Validators.pattern('[a-zA-Z]*')]),
 batch:new FormControl("",[Validators.required,Validators.pattern('[0-9]*'),Validators.min(2015),Validators.max(2019)]),
 department:new FormControl("",[Validators.required,Validators.pattern('[a-zA-Z]*')]),
 username:new FormControl("",[Validators.required,Validators.email]),
 password:new FormControl("",[Validators.required,Validators.pattern('[a-zA-z0-9]')]),
 mob:new FormControl("",[Validators.required,Validators.pattern('[0-9]*'),Validators.min(1000000000),Validators.max(999999999999)])

  });
  registerData(form: NgForm) {
    console.log(form);
    this.service.registerStudent(form.value).subscribe(
      (data) => { console.log(data);this.message=data.description}, (err) =>{ console.log('some error'); } );
      }
  ngOnInit() {
  }
}
