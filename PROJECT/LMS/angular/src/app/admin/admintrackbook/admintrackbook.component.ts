import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/admin.service';

@Component({
  selector: 'app-admintrackbook',
  templateUrl: './admintrackbook.component.html',
  styleUrls: ['./admintrackbook.component.css']
})
export class AdmintrackbookComponent implements OnInit {
  selectedbook;
  books;
  search;
  constructor(private service:AdminService) { 
    this.trackBook();
  }
  trackBook(){
    this.service.trackBook().subscribe((data)=>{console.log(data);
    this.books=data.bookDetailsBeans;
    //data.bookDetailsBeans.bookBean:
    });
  }
  selectedBook(book){
    this.selectedbook=book;
  }


  ngOnInit() {
  }

}
