import { Component, OnInit } from '@angular/core';
import { LibrarianService } from 'src/app/librarian.service';

@Component({
  selector: 'app-issuebook',
  templateUrl: './issuebook.component.html',
  styleUrls: ['./issuebook.component.css']
})
export class IssuebookComponent implements OnInit {
  books;
  selectedbook;
   user;
   message;
   search;
  constructor(private service:LibrarianService) {
    this.viewRequest();
   }
  viewRequest(){
    this.user= JSON.parse(localStorage.getItem("user"));
     return this.service.viewBookRequest().subscribe((data)=>{console.log(data);
       this.books=data.bookDetailsBeans});
  }
  selectedBook(book){
  this.selectedbook=book;
  }
  issueBook(){
    this.service.issueBook(this.selectedbook.bdid).subscribe((data)=>{this.message=data.description;})
  }


  ngOnInit() {
  }

}
