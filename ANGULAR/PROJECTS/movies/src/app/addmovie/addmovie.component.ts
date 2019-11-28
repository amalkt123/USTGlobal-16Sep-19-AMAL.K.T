import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';
import { CustomValidation } from './customvalidation';
@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {

  get name(){
return this.form.get("name");
  }
  get url(){
    return this.form.get("url");
      }
      get desc(){
        return this.form.get("desc");
          }
  constructor() { }
form =new FormGroup({name:new FormControl('',[Validators.required,CustomValidation.unique]),
url:new FormControl('',[Validators.required,CustomValidation.space]),
desc:new FormControl('',[Validators.required,CustomValidation.space])

                     })
                     ;
                     add(form:NgForm){

                     }
  ngOnInit() {
  }

}
