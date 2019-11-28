import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-sources',
  templateUrl: './sources.component.html',
  styleUrls: ['./sources.component.css']
})
export class SourcesComponent implements OnInit {
srcn;
  constructor(private service:UserService) { }

  selectedSource(event){
  
    console.log(event.target.value);
    this.service.getSource(event.target.value).subscribe(data=>{
      console.log(data);this.srcn=data.articles;
    },err=>{
      console.log(err);
    },()=>{
      console.log("data get successfully");
    });
  }
  ngOnInit() {
  }

}
