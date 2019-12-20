import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
//import { AuthserviceService } from '../authservice';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private service:AuthService ) { }


  AddProduct(form: NgForm) {
      console.log(form.value);
      this.service.AddProduct(form.value).subscribe(response => {
        console.log('response of add books', response);
        if (response !== 0) {
          alert('product added');
  
        }
        form.reset();
      }, err => {
        console.log(err);
      });
    }
  
  
ngOnInit() {
  }

}
