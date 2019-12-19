import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/admin.service';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';

@Component({
  selector: 'app-adminviewbook',
  templateUrl: './adminviewbook.component.html',
  styleUrls: ['./adminviewbook.component.css']
})
export class AdminviewbookComponent implements OnInit {
  books;
  selectedbook;
  message;
  constructor(private service:AdminService) { 
    this.viewBook();
  }

  viewBook() {
    this.service.viewBook().subscribe((data) => {
      console.log(data);
      this.books = data.bookBeans;
    }, (err) => {
      console.log(err);
    });
  }
  selectedBook(book) {
    this.selectedbook = book;
  }deleteBook(){
    this.service.deleteBook(this.selectedbook.id).subscribe((data)=>{this.message=data.description;});
  }


  ngOnInit() {
  }

}
