import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  news;
  constructor(private http: HttpClient) {
    this.getNews();
  }
  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=9ef4558bdfee441aad2df659df66738d').subscribe(data => {
      this.news = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    });
  }

  ngOnInit() {
  }

}
