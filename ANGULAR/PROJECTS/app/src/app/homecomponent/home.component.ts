import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';




@Component({
    selector : 'app-home',
    templateUrl: './home.component.html',
    styleUrls : ['./home.component.css']

})








export class HomeComponent {
news;
    constructor(public http:HttpClient) { 
        this.getNews();
     } 




getNews(){
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=96731bd8caf842639313b75ad1d5fa62').subscribe(data=>{
        console.log(data);
         this.news=data.articles;},err=>{
            console.log(err);},()=>{
                console.log("data get successfully");  });

}


}