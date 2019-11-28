import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
   Products=[{
  imgurl:"https://cdn.pixabay.com/photo/2017/06/27/19/15/hatching-chicks-2448541__340.jpg",
  name:"egg",
  price:"5"
},
{
  imgurl:"https://cdn.pixabay.com/photo/2014/05/23/23/17/dessert-352475__340.jpg",
  name:"cake",
  price:"10"
},
{
  imgurl:"https://cdn.pixabay.com/photo/2016/01/05/13/58/apple-1122537__340.jpg",
  name:"apple",
  price:"100"
}]



  constructor() { }

  ngOnInit() {
  }

}
