import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  error: string;
  msg;

  constructor(private auth: LibraryService, private router: Router) { }

  login(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.loginUser(form.value).subscribe(data => {
      console.log('Response of login', data);
      if (data && data.message === 'Success') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        const userDetails = JSON.parse(localStorage.getItem('userDetails'))
        console.log(userDetails)
        if (userDetails && userDetails.users[0].userRole === 'admin') {
          this.router.navigateByUrl('/');
        } else if (userDetails && userDetails.users[0].userRole === 'student') {
          this.router.navigateByUrl('/student');
        } else {
          this.router.navigateByUrl('/lib');
        }


        form.reset();
      } else {
        this.msg = "invalid user name or password";
        form.reset();
      }
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });

  }

  ngOnInit() {
  }

}
