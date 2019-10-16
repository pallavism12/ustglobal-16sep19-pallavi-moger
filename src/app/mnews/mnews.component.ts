import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-mnews',
  templateUrl: './mnews.component.html',
  styleUrls: ['./mnews.component.css']
})
export class MnewsComponent implements OnInit {
  news;
  ip;
  constructor(private http: HttpClient) { }

  ngOnInit() {
  }


  getSearch(event) {
    this.ip = event.target.value;
    this.http.get<any>('http://www.omdbapi.com/?apikey=d5c95b97&s=' + this.ip).subscribe(data => {
      this.news = data.Title;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('source getting...');
    });
  }



}
