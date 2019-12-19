import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import { NgForm } from '@angular/forms';
import { UserService } from 'src/app/user.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
message;



  constructor(private service:UserService,private router: Router) { }
  loginData(form: NgForm) {
    console.log(form.value);
    return this.service.login(form.value).subscribe(
      (data) => {
        this.message=data.description;
        localStorage.setItem('user', JSON.stringify(data));
        console.log(data);
        if (data.type === 'admin') {
          this.router.navigate(['/admin-home']);
        } else if (data.type === 'librarian') {
          this.router.navigate(['/librarian-home']);
        } else if (data.type === 'student') {
          this.router.navigate(['/student-home']);
        }
      },
      (error) => { console.log('some error'); },
    );
  }



  ngOnInit() {
  }

}
