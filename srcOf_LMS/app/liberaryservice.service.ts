import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from './student';
import { Observable } from 'rxjs';
import { Book } from './Book';

@Injectable({
  providedIn: 'root'
})
export class LiberaryserviceService {

  constructor(private http:HttpClient) { }

  getStudent(sId:number):Observable<Student>
  {
    console.log("Get request sent...."); 
    return this.http.get<Student>("http://localhost:8080/student/"+sId);

  }
  getBook(bId:number):Observable<Book>
  {
    console.log("Get request sent...."); 
    return this.http.get<Book>("http://localhost:8080/book/"+bId);

  }

  postStudent(st:Student):Observable<Student>
  {
      return this.http.post<Student>("http://localhost:8080/student",st);
  }

  postBook(st:Book):Observable<Book>
  {
      return this.http.post<Book>("http://localhost:8080/book",st);
  }

  getAllStudents():Observable<Student[]>
  {
    console.log("Get all request sent...."); 
    return this.http.get<Student[]>("http://localhost:8080/students");

  }
  getAllBook():Observable<Book[]>
  {
    console.log("Get all request sent...."); 
    return this.http.get<Book[]>("http://localhost:8080/books");
  }

  deleteStudent(sId:number):Observable<any>
  {
    return this.http.delete("http://localhost:8080/student/"+sId,{responseType:'text'});

  }

  deleteBook(bId:number):Observable<any>
  {
    return this.http.delete("http://localhost:8080/book/"+bId,{responseType:'text'});

  }

  updateStudent(student:Student,sId:number):Observable<Student>
  {
   return this.http.put<Student>("http://localhost:8080/student/"+sId,student,{responseType:'text'as'json'});

  }
  
  updateBook(books:Book,bId:number):Observable<Student>
  {
   return this.http.put<Student>("http://localhost:8080s/book/"+bId,Book,{responseType:'text'as'json'});

  }
}