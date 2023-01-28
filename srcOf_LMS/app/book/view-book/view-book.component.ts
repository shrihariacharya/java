import { Component } from '@angular/core';
import {  LiberaryserviceService } from 'src/app/liberaryservice.service';
import { Book} from 'src/app/Book';

@Component({
  selector: 'app-view-book',
  templateUrl: './view-book.component.html',
  styleUrls: ['./view-book.component.css']
})
export class ViewBookComponent {
  book:Book[]=[];
  
  displayedColumns1: string[] = ['bId','bBookName','bAuthorName','bPrice','actions'];

  constructor(private serv:LiberaryserviceService)
  {}
  
 
  ngOnInit(): void {
    this.getAllBooks();
  }
 

  getAllBooks()
  {

    this.serv.getAllBook().subscribe((data)=>
      {
          this.book=data;

      });
      console.log(this.book)
  }



  openDeleteModal(id:number)
  {
    
    if(window.confirm("Do you want to delete this record?"))
    {
            this.serv.deleteBook(id).subscribe(() => {
              this.getAllBooks();
                      
            });
          }

  }

}
