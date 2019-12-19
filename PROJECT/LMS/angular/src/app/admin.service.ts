import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http:HttpClient) { }



  //register Librarian
  registerLibrarian(value) {
    return this.http.post(`http://localhost:8080/lms/librarian-register`, value);
  }

  //view librarian
  viewLibrarian() {
    return this.http.get<any>('http://localhost:8080/lms/view-librarians');
  }

  //delete librarian
  deleteLibrarian(id){
    return this.http.delete<any>(`http://localhost:8080/lms/delete-librarian/${id}`);
  }






//view student
viewStudent() {
  return this.http.get<any>('http://localhost:8080/lms/view-students');

}

//delete student
deleteStudent(id){
  return this.http.get<any>(`http://localhost:8080/lms//${id}`);
}







  //view book
  viewBook() {
    return this.http.get<any>('http://localhost:8080/lms/view-books');
  }

  //deletebook
deleteBook(id){
  return this.http.get<any>(`http://localhost:8080/lms/delete-book/${id}`);
}

//track book
trackBook(){
  return this.http.get<any>(`http://localhost:8080/lms/track-book`);
 }


}
