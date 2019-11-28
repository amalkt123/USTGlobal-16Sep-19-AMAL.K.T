import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-form4',
  templateUrl: './form4.component.html',
  styleUrls: ['./form4.component.css']
})
export class Form4Component implements OnInit {

  constructor() { }
  addProduct(form:NgForm){
    console.log(form);
  }

  ngOnInit() {
  }

}
