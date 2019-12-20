import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  AddProduct(user): Observable<any> {
    return this.http.post('http://localhost:8080/addproduct', user);
 }
 
 
 updateProduct(user): Observable<any> {
    return this.http.post('http://localhost:8080/updateproduct', user);




  }
}
