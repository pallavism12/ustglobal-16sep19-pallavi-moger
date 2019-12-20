import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addbooks',
  templateUrl: './addbooks.component.html',
  styleUrls: ['./addbooks.component.css']
})
export class AddbooksComponent implements OnInit {
  error: string;
  msg: string;



  constructor(private libraryService: LibraryService, private router: Router) { }

  addBook(bookform) {
    this.libraryService.addBook(bookform.value).subscribe(res => {
      //console.log('book added successfully');
      // alert('Book Added Successfully...!');
      this.msg = "Book Added Successfully...";
      // this.router.navigateByUrl('/lib');
      // this.msg='Book Added Successfully';
      bookform.reset();
    }, err => {
      console.log('book not added');
    });
  }





  ngOnInit() {
  }

}
