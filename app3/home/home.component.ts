/* import { Component } from "@angular/core";


@Component({
    selector: 'app-home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.css']
})
export class HomeComponent {
    constructor() {

    }
}
 */
import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
    selector: 'app-home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
    news;
    // img = 'https://cdn.pixabay.com/photo/2019/04/07/13/58/pond-4109750__340.jpg';
    // isActive = false;
    constructor(private http: HttpClient) {
        this.getNews();
        // setTimeout(() => {
        // this.isActive = !this.isActive;
        // }, 200);
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
