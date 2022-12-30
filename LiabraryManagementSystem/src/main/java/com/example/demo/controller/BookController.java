package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.BookDto;
import com.example.demo.Dto.Studentdto;
import com.example.demo.entities.Book;
import com.example.demo.entities.Student;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.exception.UserNotFoundexception;
import com.example.demo.service.BookService;

@RestController
public class BookController {

	@Autowired(required=true)
	BookService bs;
	
	@PostMapping("/book")
	public  ResponseEntity<Book> createBook(@RequestBody @Valid BookDto bd)
	{	  	
		Book b=bs.createBook(bd);
		if(b!=null)
			return new ResponseEntity<Book>(b, HttpStatus.CREATED);
		
	   return new ResponseEntity<Book>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBook(@PathVariable int id)
	{
		try {
		Book b=bs.getBook(id);
		if(b!=null)
			return new ResponseEntity<Book>(b, HttpStatus.OK);
		}catch(Exception e)
		{		
	       throw new BookNotFoundException("Book not found");
		}
		 return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks()
	{
		try {
			List<Book> blist=bs.getAllBooks();
			if(blist!=null)
				return new ResponseEntity<List<Book>>(blist, HttpStatus.OK);
			}catch(Exception e)
			{		
		       e.printStackTrace();
			}
			 return new ResponseEntity<List<Book>>(HttpStatus.NOT_FOUND);
		
	}
	
	@PutMapping("/book/{id}")
	public ResponseEntity<String> updateBook(@PathVariable int id,@RequestBody BookDto bd)
	{
		try
		{
			String s=bs.updateBook(id, bd);
			if(s!=null)
				return new ResponseEntity<String>(s,HttpStatus.CREATED);
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		
	
	@DeleteMapping("/book/{id}")
	public ResponseEntity <String>deleteBook(@PathVariable int id)
	{
		try
		{
		String s=bs.deletetBook(id);
		if(s!=null)
			return new ResponseEntity<String>(s,HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}
	
	
}
