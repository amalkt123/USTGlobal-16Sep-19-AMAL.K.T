import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
ctry
  constructor(private service:UserService) { }
  selectedCategory(event){
    console.log(event.target.value);
    this.service.getCategory(event.target.value).subscribe(data=>{
      console.log(data);
      this.ctry=data.articles;},err=>{
        console.log(err);},()=>{
          console.log("data get sucessfully");
    });

  }
  ngOnInit() {
  }

}
