import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-librarian',
  templateUrl: './librarian.component.html',
  styleUrls: ['./librarian.component.css']
})
export class LibrarianComponent implements OnInit {
  requests: any = {};
  bookRequests: any[] = [];
  msg: string;

  constructor(private service: LibraryService, private router: Router) {
    this.requestedBook();

  }

  requestedBook() {
    this.service.bookRequest().subscribe(data => {
      console.log(data);
      this.requests = data;
      console.log(this.requests);
      console.log(this.requests.bookReg);
      this.bookRequests = this.requests.bookReg;
    });
  }

  acceptReq(reqs) {
    this.service.acceptReq(reqs).subscribe(data => {
      console.log(data);
      // alert('you accepted the request');
      this.msg = "Accepting the request";
      this.requestedBook();
    });

  }

  decline(reqs) {
    console.log(reqs.bookId);

    this.service.declineBook(reqs.bookId, reqs).subscribe(dat => {
      console.log(dat);
      //alert('Request Declined...!');
      this.msg = "Request Declined";
      this.requestedBook();
    });

  }
  goHome() {
    this.router.navigateByUrl('/student');
  }


  ngOnInit() {
  }

}
