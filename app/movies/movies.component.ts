import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  get text1() {
    return this.form.get('text1');
  }
  get url() {
    return this.form.get('url');
  }
  get t1() {
    return this.form.get('t1');
  }

  constructor() { }

  form = new FormGroup(
    {
      text1: new FormControl('', [Validators.required]),
      url: new FormControl('', [Validators.required]),
      t1: new FormControl('', [Validators.required]),


    });

  ngOnInit() {
  }
  loginData(form) {
    console.log(form.value);
  }

}
