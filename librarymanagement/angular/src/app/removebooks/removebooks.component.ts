import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-removebooks',
  templateUrl: './removebooks.component.html',
  styleUrls: ['./removebooks.component.css']
})
export class RemovebooksComponent implements OnInit {

  books: [];
  msg: string;
  constructor(private library: LibraryService, private router: Router) {
    this.deletedBook();

  }

  deletedBook() {
    this.library.getAllBook().subscribe(data => {
      console.log(data);
      this.books = data.books;

    });
  }


  deleteBook(book) {

    this.library.deleteBook(book.bookId).subscribe(data => {
      console.log(data);
      //alert('Book Deleted Successfully');
      this.msg = "Book Deleted Successfully";
      this.deletedBook();

    });
  }




  ngOnInit() {
  }

}
