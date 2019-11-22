import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  InputData = '';

  constructor() { }

  ngOnInit() {
  }
  printAlertMsg() {
    alert("go to your home")
  }
  dataInput(event) {
    console.log(event.target.value)
    this.InputData = event.target.value;
  }

}
