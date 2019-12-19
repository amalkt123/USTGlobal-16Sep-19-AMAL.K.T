import { Component, OnInit } from '@angular/core';
import { LibrarianService } from 'src/app/librarian.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-viewbook',
  templateUrl: './viewbook.component.html',
  styleUrls: ['./viewbook.component.css']
})
export class ViewbookComponent implements OnInit {
  books;
  selectedbook;
  message;
  constructor(private service:LibrarianService) {
    this.viewBook();
   }
   get id(){
     return this.updateBook.get("id");
   }
   get name(){
     return this.updateBook.get("name");
   }
   get author(){
     return this.updateBook.get("author");
   }
   get subject(){
     return this.updateBook.get("subject");
   }
   get publication(){
     return this.updateBook.get("publication");
   }
   get price(){
     return this.updateBook.get("price");
   }

updateBook=new FormGroup({
  id:new FormControl("",[Validators.required]),
  name:new FormControl("",[Validators.required]),
  author:new FormControl("",[Validators.required,Validators.pattern('[a-zA-Z]*')]),
  subject:new FormControl("",[Validators.required,Validators.pattern('[a-zA-Z]*')]),
  status:new FormControl("",[Validators.required]),
  publication:new FormControl("",[Validators.required]),
  price:new FormControl("",[Validators.required,Validators.pattern('[0-9]'),Validators.min(2),Validators.max(300000)])

});
  ngOnInit() {
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
  }
  deleteBook(){
    this.service.deleteBook(this.selectedbook.id).subscribe((data)=>{this.message=data.description});
  }

  updateBookRequest(updateBook){
    
  }
}
