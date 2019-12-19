import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private router:Router) { }
home(){
  let data= JSON.parse(localStorage.getItem("user"));
  if (data.type === 'admin') {
    this.router.navigate(['/admin-home']);
  } else if (data.type === 'librarian') {
    this.router.navigate(['/librarian-home']);
  } else if (data.type === 'student') {
    this.router.navigate(['/student-home']);
  }

  
}


  
isLogout(){
  if(localStorage.getItem("user")){
    return true;
  }
  else{
    return false;
  }
}


  logout(){
    localStorage.removeItem("user");
    this.router.navigateByUrl('/');
  }

  ngOnInit() {
  }

}
