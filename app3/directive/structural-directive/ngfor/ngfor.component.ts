import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {
  Products = [
    {
      img: "https://cdn.pixabay.com/photo/2019/09/14/12/40/iceland-4475920__340.jpg",
      name: "a",
      price: 100
    },
    {
      img: "https://cdn.pixabay.com/photo/2019/09/08/15/08/owl-4461236__340.jpg",
      name: "b",
      price: 200
    },
    {
      img: "https://cdn.pixabay.com/photo/2019/09/30/18/41/taxi-4516525__340.jpg",
      name: "c",
      price: 300
    }
  ]
  constructor() {

  }

  ngOnInit() {
  }

}
