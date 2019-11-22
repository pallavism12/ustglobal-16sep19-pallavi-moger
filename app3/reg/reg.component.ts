import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-reg',
  templateUrl: './reg.component.html',
  styleUrls: ['./reg.component.css']
})
export class RegComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy {
  users;
  selectedUser;
  today = new Date();
  constructor(private service: UserService) {
    console.log('constructor is executed');
    this.getData();
  }

  ngOnInit() {
    console.log('ngOnInit is executed');

  }
  ngDoCheck() {
    console.log('ngdocheck is executed');
  }
  ngAfterViewInit() {
    console.log('ngAfterViewInit is executed');
  }
  ngAfterViewChecked() {
    console.log('ngAfterViewChecked function is executed');
  }
  ngOnDestroy() {
    console.log('ngOndestroy function is executed');
  }
  loginData(form) {
    console.log(form.value);
    this.service.postUser(form.value).subscribe((data) => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data posted successfully');
    });
  }
  getData() {
    this.service.getUsers().subscribe(data => {
      console.log(data);
      this.users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
  }
  deleteData(user) {
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      // tslint:disable-next-line: quotemark
      console.log("data deleted successfully");
    });
  }
  selectUser(user) {
    console.log(user);
    this.selectedUser = user;
  }
  updateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.id, form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data updated');
    });

  }
}
