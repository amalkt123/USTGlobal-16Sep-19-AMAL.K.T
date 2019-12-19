import { Component, OnInit } from '@angular/core';
import { StudentService } from 'src/app/student.service';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-studentbook',
  templateUrl: './studentbook.component.html',
  styleUrls: ['./studentbook.component.css']
})
export class StudentbookComponent implements OnInit {
  books;
  selectedbook;
  user;
  message;
  search;
  
  constructor(private service:StudentService) {
  this.getbook();
   }
   getbook() {
    return this.service.getbooks().subscribe((data) => { this.books = data.bookBeans;
    console.log(data); }, (err) => { console.log(err) });
  }
  selectedBook(value) {
    this.selectedbook = value;
    console.log(this.selectedbook.name);

  }

  makeRequest() {
  
    this.user = JSON.parse(localStorage.getItem('user'));
    this.service.makeRequest(this.selectedbook.id, this.user.studentBean.sid).subscribe((data) => {
      console.log(data);
     this.message= data.description;
    }, (err) => { console.log(err); });


  }
  

  

  ngOnInit() {
  }

}
