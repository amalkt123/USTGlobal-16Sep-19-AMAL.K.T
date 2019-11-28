import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-searchnews',
  templateUrl: './searchnews.component.html',
  styleUrls: ['./searchnews.component.css']
})
export class SearchnewsComponent implements OnInit {
  search;
  constructor(private service:UserService) {}
  selectedSearch(event){
    console.log(event.viewModel);
  
    this.service.getSearch(event.viewModel).subscribe(data=>{
      console.log(data.articles);
      this.search=data.articles;
      },err=>{
        console.log(err);},()=>{
          console.log("data get successfully");
      });
  }
  ngOnInit() {
  }

}
