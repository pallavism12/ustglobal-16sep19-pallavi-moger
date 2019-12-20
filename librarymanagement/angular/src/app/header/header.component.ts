import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private router: Router) { }

  isLoggedIn(): boolean {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails) {
      return true;
    } else {
      return false;
    }
  }

  isLibrarian() {

    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.users[0].userRole === 'librarian') {
      return true;
    } else {

      return false;
    }

  }

  logout() {
    localStorage.removeItem('userDetails');
    this.router.navigateByUrl('/login');
  }

  isStudent() {

    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.users[0].userRole === 'student') {
      return true;
    } else {

      return false;
    }

  }

  ngOnInit() {
  }

}
