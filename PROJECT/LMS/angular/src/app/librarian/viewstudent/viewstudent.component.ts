import { Component, OnInit } from '@angular/core';
import { LibrarianService } from 'src/app/librarian.service';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-viewstudent',
  templateUrl: './viewstudent.component.html',
  styleUrls: ['./viewstudent.component.css']
})
export class ViewstudentComponent implements OnInit {
  students;
  selectedstudent;
  message;
  search;
  constructor(private service:LibrarianService,private userservice:UserService) { 
    this.viewStudents();
  }
  viewStudents() {
    this.service.viewStudent().subscribe((data) => { this.students = data.studentBeans; }, (err) => { console.log(err); });

  }
  selectedStudent(student) {
    this.selectedstudent = student;
  }
  removeStudent(){
    this.userservice.deleteUser(this.selectedstudent.id).subscribe((data)=>{
      this.message=data.description;
    });
  }

  ngOnInit() {
  }

}
