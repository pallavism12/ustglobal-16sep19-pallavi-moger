import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor(private service: AuthService) { }
  
  submitForm(form: NgForm) {
    this.service.updateProduct(form.value).subscribe(response => {
      console.log('response of update books', response);
      if (response !== 0) {
        alert('product updated');

      }
      form.reset();
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
