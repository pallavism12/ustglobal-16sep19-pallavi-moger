import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
  news;
  ip;
  constructor(private http: HttpClient) {
    this.getC();
  }

  ngOnInit() {
  }
  getCat(event) {
    this.ip = event.target.value;
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=9ef4558bdfee441aad2df659df66738d&country=in&category=' + this.ip).subscribe(data => {
      this.news = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news getting.........');
    });
  }


  getC() {
    // this.ip = event.target.value;
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=de&category=business&apiKey=9ef4558bdfee441aad2df659df66738d').subscribe(data => {
      this.news = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news getting.........');
    });
  }

}
