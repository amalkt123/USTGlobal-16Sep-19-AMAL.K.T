import { Component, OnInit } from '@angular/core';
import { StudentService } from 'src/app/student.service';



@Component({
  selector: 'app-studenthistory',
  templateUrl: './studenthistory.component.html',
  styleUrls: ['./studenthistory.component.css']
})
export class StudenthistoryComponent implements OnInit {
books;
selectedbook;
search;
  constructor(private service:StudentService) { 
   this.bookHistory()
  }
bookHistory(){
  let data=JSON.parse(localStorage.getItem('user'));
  console.log(data);
  this.service.bookHistory(data.studentBean.sid).subscribe(data=>{console.log(data);
    this.books=data.bookDetailsBeans;
  },(err)=>{
    console.log(err);
  });

}
selectedBook(book){
  this.selectedbook=book;
}
  ngOnInit() {
  }

}
