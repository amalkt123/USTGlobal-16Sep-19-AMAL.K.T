import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
    name='ram';
   imgurl='https://cdn.pixabay.com/photo/2019/09/26/14/04/etretat-4506073__340.jpg';
   address='madiwalla';
   colorname:string="red";
   isactive=false;
   colomspanvalue=2;



  constructor() { 
    setInterval(()=>{
      this.address="kavumpuram";
      this.colorname='blue';
      this.imgurl='https://cdn.pixabay.com/photo/2019/09/26/14/04/etretat-4506073__340.jpg';
      this.isactive = ! this.isactive;
    },2000)
  }

  ngOnInit() {
    setInterval(()=>{
      this.colorname='yellow';
      this.address="konnackal";
      this.imgurl="https://cdn.pixabay.com/photo/2019/09/27/00/50/beach-4507253__340.jpg";
    },4000)
  }

}
