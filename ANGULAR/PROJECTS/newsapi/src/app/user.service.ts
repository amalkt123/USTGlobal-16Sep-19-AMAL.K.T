import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {
//------------------------------------------------------home page method---------------------------------------------------//
  constructor(public http:HttpClient) { }
  getEntertainment(){
    return this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=96731bd8caf842639313b75ad1d5fa62

    `);

  }
 getSports(){
    return this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=96731bd8caf842639313b75ad1d5fa62

    `);
  }
  getTop(){
    return this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=96731bd8caf842639313b75ad1d5fa62

    `);
  }
  //----------------------------------------------------------end home page method--------------------------------------------//

  //----------------------------------------------------------countries page method--------------------------------------------//

  getCountries(value){
return this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=${value}&category=business&apiKey=96731bd8caf842639313b75ad1d5fa62`);
  }

//----------------------------------------------------------end countries page method--------------------------------------------//



//----------------------------------------------------------category page method--------------------------------------------//

getCategory(value){
  return this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=de&category=${value}&apiKey=96731bd8caf842639313b75ad1d5fa62`);
}




//----------------------------------------------------------end category page method--------------------------------------------//



//----------------------------------------------------------source page method--------------------------------------------//

getSource(value){
  return this.http.get<any>('https://newsapi.org/v2/top-headlines?sources='+value+'&apiKey=96731bd8caf842639313b75ad1d5fa62');
}


//----------------------------------------------------------end source page method--------------------------------------------//



//----------------------------------------------------------search page method--------------------------------------------//

getSearch(value){
  return this.http.get<any>(`https://newsapi.org/v2/everything?q=${value}&apiKey=96731bd8caf842639313b75ad1d5fa62`);
 // return this.http.get<any>("https://newsapi.org/v2/everything?q=${value}&apiKey=96731bd8caf842639313b75ad1d5fa62"); ${} not work with double quotes and single quotes ${} it will work only with backtik `
}



//----------------------------------------------------------end search page method--------------------------------------------//




  
}
