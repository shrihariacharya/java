package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Book;
import com.example.demo.entities.Student;
import com.example.demo.repositories.Bookrepository;

@SpringBootTest

class Demo2DtoLayeringApplicationTests {

	 @Autowired
	   Bookrepository bp;
		
		@Test
		public void testcreatebook() {
			Book b=Book.builder().bId(1)
					.bBookName("geeta")
					.bAuthorName("vyas muni")
					.bPrice(1000).build();
			    bp.save(b);
			assertNotNull(bp.findById(1).get());
			
		}
		
			@Test
			@DisplayName("it should return book lists by 2")
			void getallbooks()
			{
				Book b=new Book();
				b.setBId(3);
				b.setBBookName("Harry potter");
				b.setBAuthorName("J.K.Rowling");
				b.setBPrice(190);
				bp.save(b);
				
				Book b1=new Book();
				b1.setBId(4);
				b1.setBBookName("Fear of flying");
				b1.setBAuthorName("Erica");
				b1.setBPrice(390);
				bp.save(b1);
				
				List<Book>blist=bp.findAll();
				assertNotNull(blist);
				
				assertThat(blist).isNotNull();
			}
			
		@Test
		@DisplayName("it should update book name")
		void updatebook()
		{
			Book b1=new Book();
			b1.setBId(4);
			b1.setBBookName("Fear of flying");
			b1.setBAuthorName("Erica");
			b1.setBPrice(390);
			bp.save(b1);
			
			Book bk=bp.findById(b1.getBId()).get();
			bk.setBBookName("The diary of a young girl");
			Book updatedbook=bp.save(bk);
			
			assertEquals("The diary of a young girl",updatedbook.getBBookName());
			assertEquals("Erica",updatedbook.getBAuthorName());
			
			
		}

		@Test
		@DisplayName("it should return book by its id")
		void getbookbyid()
		{
			Book b=new Book();
			b.setBId(3);
			b.setBBookName("Harry potter");
			b.setBAuthorName("J.K.Rowling");
			b.setBPrice(190);
			bp.save(b);
			
			Book newbook=bp.findById(b.getBId()).get();
			
			assertNotNull(newbook);
			assertEquals("Harry potter",newbook.getBBookName());
	       
		}
	}
