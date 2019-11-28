import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
searchs:any=[
  
];
  constructor(private http:HttpClient) { }
  selectedSearch(event){
    console.log(event.target.value);
  
    this.http.get<any>(`http://www.omdbapi.com/?s=${event.target.value}&apikey=b7498673`).subscribe(data=>{
      console.log(data);
      console.log(data.Search);
      this.searchs=data.Search;
    
  
      },err=>{
        console.log(err);},()=>{
          console.log("data get successfully");
      });
  }
  ngOnInit() {
  }

}
