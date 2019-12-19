import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LibrarianService {

  constructor(private http:HttpClient) { }

  //add book
  addBook(book){
    return this.http.post<any>(`http://localhost:8080/lms/add-book`,book);
 }



 //view book request
 viewBookRequest(){
  return this.http.get<any>(`http://localhost:8080/lms/view-book-request`);
}
//verify book
issueBook(id){
  return this.http.get<any>(`http://localhost:8080/lms/issue-book/${id}`);
}

//view book
viewBook() {
  return this.http.get<any>('http://localhost:8080/lms/view-books');
}

//updateBook
updateBookRequest(updateBook){
  {
    return this.http.post<any>(`thhp://localhost:8080/lms//upate-book`,updateBook);
  }
}

//deletebook
deleteBook(id){
  return this.http.get<any>(`http://localhost:8080/lms/delete-book/${id}`);
}

//track book
trackBook(){
  return this.http.get<any>(`http://localhost:8080/lms/track-book`);
 }

//verify student
verifyStudent():Observable<any> {
  return this.http.get<any>(`http://localhost:8080/lms/view-student-request`);
}

//verifyed student
verifyedStudent(login){
 return this.http.post<any>(`http://localhost:8080/lms/student-approve`,login);
}
//view student
viewStudent() {
  return this.http.get<any>('http://localhost:8080/lms/view-students');
}

}
