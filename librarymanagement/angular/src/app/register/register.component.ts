import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private auth: LibraryService) { }

  error: string;
  msg: string;

  register(form: NgForm) {
    console.log('hiiii');
    this.error = null;
    this.auth.registerUser(form.value).subscribe(res => {
      console.log(res);
      this.msg = "Registered Successfully"
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    }, () => {
      console.log('data registered');
    });

  }

  ngOnInit() {
  }

  ngOnDestroy() {
    this.error = null;
  }

}
