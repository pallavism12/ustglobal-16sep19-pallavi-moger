import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  books: any[] = [];
  msg: string

  constructor(private auth: LibraryService, private router: Router) {
    this.requestedBook();
  }

  requestedBook() {
    this.auth.getAllBook().subscribe(data => {
      console.log(data);
      this.books = data.books;

    });
  }

  sendRequest(book) {
    console.log(book);
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    console.log('Details of Student', userDetails);
    const userId = userDetails.users[0].userId;

    this.auth.requestBook(userId, book).subscribe(data => {
      // alert('Request has been sent to the Librarian');
      this.msg = "Request has been sent to the Librarian";
      console.log(data);
      this.requestedBook();
    })

  }



  ngOnInit() {
  }

}
