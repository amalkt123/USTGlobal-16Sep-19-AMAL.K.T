import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  //login

  loginData(form):Observable<any>{
   return this.http.post<any>(`http://localhost:8081/login`,form);
  }
  

  //register

  registerUser(form):Observable<any>{
    return this.http.post<any>(`http://localhost:8081/register`,form);
  }

  //forgotpassword
  forgotPassword(form){
    return this.http.post<any>(`http://localhost:8080`,form);
  }


  //changePassword
  changePassword(form):Observable<any>{
    return this.http.post<any>('http://localhost:8080',form);
  }

  //compose
  composeEmail(data):Observable<any>{
    let user=JSON.parse( localStorage.getItem("user"));
    return this.http.get<any>(`http://localhost:8081/compose?email=${data.email}&subject=${data.subject}&message=${data.message}&id=${user[0].id}`,);

  }

  //draftmail
  adddraftMail(form,email){
    return this.http.post<any>(`http://localhost:8080`,form,email);
  }

//inbox
inbox():Observable<any>{
  let user=JSON.parse(localStorage.getItem("user"));
  console.log(user[0].id);
  return this.http.get<any>(`http://localhost:8081/inbox?to_id=${user[0].id}`);
}
//delete email
deleteEmail(form):Observable<any>{
return this.http.delete<any>(`http://localhost:8081/parmanent/id=${form}`);
}
//sent mail
sentMail():Observable<any>{
  let user=JSON.parse(localStorage.getItem("user"));
return this.http.get<any>(`http://localhost:8081/send?from_id=${user[0].id}`);
}

//draft mail
draftMail():Observable<any>{
  let user=JSON.parse(localStorage.getItem("user"))
  console.log(user);

  return this.http.get<any>(`http://localhost:8081/draftlist?to_id=${user[0].id}`);
  }


}
