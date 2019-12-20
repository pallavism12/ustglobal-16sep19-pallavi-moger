import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
const headeroption = {
  headers: new HttpHeaders({ 'Content-type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class LibraryService {



  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/librarymanagement/register', user);
  }

  loginUser(user): Observable<any> {
    console.log("hi")
    return this.http.post('http://localhost:8080/librarymanagement/login', user);
  }

  getAllBook(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/librarymanagement/getAllBook');
  }

  requestBook(userId, data): Observable<any> {
    return this.http.post(`http://localhost:8080/librarymanagement/allocatebook/${userId}`, data, headeroption);
  }

  bookRequest(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/librarymanagement/viewreqs', headeroption);
  }

  acceptReq(data): Observable<any> {
    return this.http.post(`http://localhost:8080/librarymanagement/acceptreq`, data, headeroption);

  }

  addBook(book): Observable<any> {
    return this.http.post('http://localhost:8080/librarymanagement/addBook', book);
  }

  declineBook(id, data): Observable<any> {
    return this.http.post(`http://localhost:8080/librarymanagement/bookaction1/${id}`, data, headeroption);
  }

  deleteBook(id): Observable<any> {
    console.log('deleting id', id);
    return this.http.delete(`http://localhost:8080/librarymanagement/deleteBook/${id}`, headeroption);
  }


}
