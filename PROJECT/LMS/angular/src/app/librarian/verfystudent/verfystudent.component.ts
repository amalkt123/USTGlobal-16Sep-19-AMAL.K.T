import { Component, OnInit } from '@angular/core';
import { LibrarianService } from 'src/app/librarian.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-verfystudent',
  templateUrl: './verfystudent.component.html',
  styleUrls: ['./verfystudent.component.css']
})
export class VerfystudentComponent implements OnInit {
  students;
  selectedstudent;
  selectedlogin;
  message;
  search;
  constructor(private service:LibrarianService) {
    this.verifyStudents();
   }
   verifyStudents() {
     this.service.verifyStudent().subscribe((data)=>{
       console.log(data);
       this.students=data.loginBeans;
     },(err)=>{
       console.log(err);
     });
   }

   verifyStudent(student){
     this.selectedlogin=student;
     this.selectedstudent=student.studentBean;
   }
   reject(selectedlogin){
    
     selectedlogin.status="rejected";

     this.service.verifyedStudent(selectedlogin).subscribe((data)=>{this.message=data.message;
    this.students=data.loginBeans;},(err)=>{console.log(err);});
   }
   approve(selectedlogin){
    selectedlogin.status="enable";

    this.service.verifyedStudent(selectedlogin).subscribe((data)=>{this.message=data.message;},(err)=>{console.log(err);});
    
   }

  ngOnInit() {
  }

}
