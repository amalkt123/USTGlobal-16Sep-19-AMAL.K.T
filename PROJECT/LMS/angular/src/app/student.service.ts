import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http:HttpClient) { }

   registerStudent(value):Observable<any>{
    console.log(value);
    return this.http.post<any>(`http://localhost:8080/lms/student-register`,value);

  }

//view book
  getbooks():Observable<any>{
    return this.http.get('http://localhost:8080/lms/search-books');
  }


//make request
  makeRequest(bid,sid){
console.log(bid,sid);
 return this.http.get<any>(`http://localhost:8080/lms/make-book-request?sid=${sid}&bid=${bid}`);
  }
  
//view cart
  viewBag(sid){
    return this.http.get<any>(`http://localhost:8080/lms/view-bag/${sid}`);

  }
//returnbook
  returnBook(id):Observable<any>{
     return this.http.get<any>(`http://localhost:8080/lms/return-book/${id}`);
  }
  //bookHistory
  bookHistory(sid){
   return this.http.get<any>(`http://localhost:8080/lms/student-book-history/${sid}`);
  }
}
