import { Component, OnInit } from '@angular/core';
import { NgModel } from '@angular/forms';
import { UserService } from '../user.service';


@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {
cty;
  constructor(private service:UserService) {

   }
selectedCountry(event){
  console.log(event.target.value);
  this.service.getCountries(event.target.value).subscribe(data=>{
    console.log(data);
    this.cty=data.articles;
  },err=>{
    console.log(err);
  },()=>{
    console.log("country based news");
  });
}
  ngOnInit() {
  }

}
