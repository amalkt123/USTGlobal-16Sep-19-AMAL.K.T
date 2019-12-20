import { Component, OnInit } from '@angular/core';
import { NgForm, FormGroup, FormControl, Validators } from '@angular/forms';
import { VendorService } from 'src/vendor.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {
  
message;
  constructor(private service:VendorService) { }
 
  addProduct(addForm){
    this.service.addProduct(addForm.value).subscribe(data=>{
      this.message="success";
    });
  }

  addData(form){
    console.log(form.value);
  //  this.service.addData();
  }

  
  ngOnInit() {


    }


  }