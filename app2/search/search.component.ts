import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  news;
  ip;
  constructor(private http: HttpClient) { }

  ngOnInit() {
  }
  getSearch(event) {
    this.ip = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/everything?from=2019-09-15&sortBy=publishedAt&apiKey=9ef4558bdfee441aad2df659df66738d&q=' + this.ip).subscribe(data => {
      this.news = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('source getting...');
    });
  }

}
