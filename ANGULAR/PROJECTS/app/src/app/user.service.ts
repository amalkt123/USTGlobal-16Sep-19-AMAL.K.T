import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  fileBaseurl='https://ust-global-69678.firebaseio.com/';

  constructor(public http:HttpClient) { }
  postUser(data){
console.log("service",data);
return this.http.post(`${this.fileBaseurl}/users.json`,data);


  }
  getUser(){
    return this.http.get(`${this.fileBaseurl}/users.json`).pipe(
      map(data=>{
        let newArray=[];
        for(let key in data)
        {
          newArray.push({...data[key],id:key})
        }
        return newArray;

      })
    );
}


deleteUser(id){
 return this.http.delete(`${this.fileBaseurl}/users/${id}.json`);
}

updateUser(id,data){
  return this.http.put(`${this.fileBaseurl}/users/${id}.json`,data);

}







}







