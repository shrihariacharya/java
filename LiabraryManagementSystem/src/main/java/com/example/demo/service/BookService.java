package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Dto.BookDto;

import com.example.demo.entities.Book;

@Component
public interface BookService {
	
	public Book createBook(BookDto bd);
	public Book getBook(int id);
	public List<Book> getAllBooks();
	public String deletetBook(int id);
	public String updateBook(int id, BookDto bd);
	public Book updateBookName(int id, String name);
	public String deleteAllBooks();

}
