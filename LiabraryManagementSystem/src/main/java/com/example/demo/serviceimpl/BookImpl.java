package com.example.demo.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.BookDto;
import com.example.demo.entities.Book;
import com.example.demo.repositories.Bookrepository;
import com.example.demo.service.BookService;

@Service
public class BookImpl implements BookService {

	@Autowired
	Bookrepository br;
	
	@Override
	public Book createBook(BookDto bd) {
		
		Book b1=Book.builder()
				.bBookName(bd.getBBookName())
			    .bId(bd.getBId())
				.bAuthorName(bd.getBAuthorName())
				.bPrice(bd.getBPrice()).build();
		return br.save(b1);
	}

	@Override
	public Book getBook(int id) {
	
		return br.findById(id).get();
	}

	@Override
	public List<Book> getAllBooks() {
		
		return br.findAll();
	}

	@Override
	public String deletetBook(int id) {
		br.deleteById(id);
		return "Book deleted successfully..";
	}

	@Override
	public String updateBook(int id, BookDto bd) {
	
		Book b=br.findById(id).get();
		
		Book b1=Book.builder()
				.bBookName(bd.getBBookName())
			    .bId(bd.getBId())
				.bAuthorName(bd.getBAuthorName())
				.bPrice(bd.getBPrice()).build();
		
				br.save(b1);
				return "Book updated successfully..";
	}

	@Override
	public Book updateBookName(int id, String name) {
	
		Book b=br.findById(id).get();
		b.setBBookName(name);
		return br.save(b);
	}

	@Override
	public String deleteAllBooks() {
		
	       br.deleteAll();
	     return "Book deleted successfully..";
	}

}
