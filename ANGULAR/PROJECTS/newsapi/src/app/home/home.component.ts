import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
entmt;
in;
sn;

  constructor(private service:UserService) { 
    console.log("home");
    this.getEntertainment();
    this.getIndiaNews();
    this.getSports();
    
  }

getEntertainment(){

this.service.getEntertainment().subscribe(data=>{
   this.entmt=data.articles;
  console.log(data);},err=>{
    console.log(err);},()=>{
      console.log("entertainment data get successfully");
    });
}


getIndiaNews(){
  this.service.getTop().subscribe(data=>{
    this.in=data.articles;
   console.log(data);},err=>{
     console.log(err);},()=>{
       console.log(" india news data get successfully");
     });
  }
  
  



getSports(){
  
this.service.getSports().subscribe(data=>{
  this.sn=data.articles;
 console.log(data);},err=>{
   console.log(err);},()=>{
     console.log("sports data get successfully");
   });
}








  ngOnInit() {
  }

}
