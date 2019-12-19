import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }
  //login
  login(value){
    console.log(value);
    return this.http.post<any>('http://localhost:8080/lms/login', value);

  }
  //change password
  changePassword(ids,newpassword){
    let data={id:ids,password:newpassword};
    return this.http.post<any>(`http://localhost:8080/lms/change-password`,data);
  }
  //delete User
  deleteUser(id){
    return this.http.get<any>(`http://localhost:8080/lms/delete-user/${id}`);
  }
}
