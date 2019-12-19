import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/admin.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-adminlibrarianadd',
  templateUrl: './adminlibrarianadd.component.html',
  styleUrls: ['./adminlibrarianadd.component.css']
})
export class AdminlibrarianaddComponent implements OnInit {
message;
  constructor(private service:AdminService) { }

  registerData(form:NgForm){
    return this.service.registerLibrarian(form.value).subscribe((data)=>{
      console.log(data);
      this.message=data;
    },(err)=>{console.log("error");});
  }

  ngOnInit() {
  }

}
