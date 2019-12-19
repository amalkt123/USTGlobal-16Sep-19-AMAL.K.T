import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/admin.service';

@Component({
  selector: 'app-adminstuentview',
  templateUrl: './adminstuentview.component.html',
  styleUrls: ['./adminstuentview.component.css']
})
export class AdminstuentviewComponent implements OnInit {
  students;
  selectedstudent;
  message;
  search;
  constructor(private service:AdminService) { 
    this.viewStudents();
  }

  viewStudents() {
    this.service.viewStudent().subscribe((data) => { this.students = data.studentBeans; }, (err) => { console.log(err); });

  }
  selectedStudent(student) {
    this.selectedstudent = student;
  }
  deleteStudent(){
    this.service.deleteStudent(this.selectedstudent.id).subscribe((data)=>{this.message=data.description;});
  }


  ngOnInit() {
  }

}
