import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;

  constructor() { }
  Cars=[{name:'v1',imgurl:'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg'},
    {name:'mattador',imgurl:'https://cdn.pixabay.com/photo/2013/07/13/11/36/volkswagen-158463__340.png'},
    {name:'v2', imgurl:'https://cdn.pixabay.com/photo/2019/07/07/14/03/fiat-4322521__340.jpg'},
    {name:'v3', imgurl:'https://cdn.pixabay.com/photo/2014/10/22/17/22/ford-498244__340.jpg'}]

  ngOnInit() {
  }
  sendCar(car){
    console.log(car);
    this.selectedCar=car;
  }
}
