import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name = 'Bhavya';
  imgUrl = 'https://cdn.pixabay.com/photo/2019/06/02/17/27/summer-4246927__340.jpg';
  address: string = 'Basavanagudi, Bangalore';
  colorName: string = 'green';
  isActive: boolean = false;
  colSpanValue: number = 2
  constructor() {
    setInterval(() => {
      this.isActive = !this.isActive;
    }, 5000)
  }


  ngOnInit() {
  }
}
