import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sources',
  templateUrl: './sources.component.html',
  styleUrls: ['./sources.component.css']
})
export class SourcesComponent implements OnInit {
  [x: string]: any;
  news;
  ip;
  constructor(private http: HttpClient) {
    this.getS();
  }

  ngOnInit() {
  }
  getSr(event) {
    this.ip = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=9ef4558bdfee441aad2df659df66738d&sources=' + this.ip).subscribe(data => {
      this.news = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('source getting...');
    });
  }

  getS() {
    // this.ip = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=9ef4558bdfee441aad2df659df66738d').subscribe(data => {
      this.news = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('source getting...');
    });
  }
}
