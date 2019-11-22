import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {
  constructor(private http: HttpClient) { this.getN(); }
  news;
  ip;

  ngOnInit() {
  }
  getNews(event) {
    this.ip = event.target.value;
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=9ef4558bdfee441aad2df659df66738d&country=' + this.ip).subscribe(data => {
      this.news = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    });
  }
  getN() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=9ef4558bdfee441aad2df659df66738d').subscribe(data => {
      this.news = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    });
  }
}
