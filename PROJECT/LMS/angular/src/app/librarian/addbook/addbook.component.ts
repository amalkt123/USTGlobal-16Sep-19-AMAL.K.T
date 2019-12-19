import { Component, OnInit } from '@angular/core';
import { LibrarianService } from 'src/app/librarian.service';
import { NgForm, FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {
   message;
  constructor(private service:LibrarianService) { }
  get name(){
    return this.bookForm.get('name');
  }
  get subject(){
    return this.bookForm.get('subject');
  }
  get author(){
    return this.bookForm.get('author');
  }
  get publication(){
    return this.bookForm.get('publication');
  }
  get price(){
    return this.bookForm.get("price");
  }

  bookForm=new FormGroup({
    name:new FormControl("",[Validators.required,Validators.maxLength(40),Validators.minLength(1)]),
    subject:new FormControl("",[Validators.required,Validators.minLength(2),Validators.maxLength(20),
    Validators.pattern('[a-zA-Z]*')]),
    author:new FormControl("",[Validators.maxLength(50),Validators.minLength(2),Validators.pattern('[a-zA-Z]*')]),
    publication:new FormControl("",[Validators.required,Validators.minLength(1),Validators.maxLength(50)]),
    price:new FormControl("",[Validators.min(1),Validators.max(300000000),Validators.required,Validators.pattern('[0-9]*')])
    
  });
  addBook(form:NgForm){
    return this.service.addBook(form.value).subscribe((data)=>{
        this.message=data.message;
    },(err)=>{console.log(err);});
  }
  ngOnInit() {
  }

}
