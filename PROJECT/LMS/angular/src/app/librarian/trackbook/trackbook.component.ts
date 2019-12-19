import { Component, OnInit } from '@angular/core';
import { LibrarianService } from 'src/app/librarian.service';

@Component({
  selector: 'app-trackbook',
  templateUrl: './trackbook.component.html',
  styleUrls: ['./trackbook.component.css']
})
export class TrackbookComponent implements OnInit {
selectedbook;
books;
  constructor(private service:LibrarianService) { 
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
