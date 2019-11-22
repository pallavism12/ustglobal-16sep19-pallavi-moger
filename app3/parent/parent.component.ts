import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2018/06/18/21/58/fish-3483465__340.jpg',
      name: 'fish fry'
    },
    {
      imgUrl: 'https://image.shutterstock.com/image-photo/tasty-spicy-fish-fry-indian-260nw-494141236.jpg',
      name: 'frawn'
    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2017/10/29/17/43/trout-2900325__340.jpg',
      name: 'fish'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2017/10/09/17/36/zander-filet-2834177__340.jpg',
      name: 'etc'
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }

}
