import { Component, OnInit } from '@angular/core';
import { StudentService } from 'src/app/student.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  books;
  selectedbook;
  search;
  constructor(private service:StudentService) {
    this.viewBag();
   }
  viewBag(){
    let sid=JSON.parse(localStorage.getItem("user"));
    console.log(sid);
    this.service.viewBag(sid.studentBean.sid).subscribe((data)=>{
    this.books=data.bookDetailsBeans;
    console.log(data.bookDetailsBeans);
    console.log(this.books);

    },
    (err)=>{console.log(err)});
  }
  selectedBook(book){
    this.selectedbook=book;


  }
  bookReturn(){
    let sid=JSON.parse(localStorage.getItem("user"));
    return this.service.returnBook(this.selectedbook.bdid).subscribe(
      (data)=>{console.log(data); this.books=data.bookDetailsBeans;
        this.viewBag();},
    (err)=>{console.log(err);})

  }
  ngOnInit() {
  }

}
