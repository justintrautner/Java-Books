package com.justin.mvcBooks.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.justin.mvcBooks.models.Book;
import com.justin.mvcBooks.repositories.BookRepository;

@Service
public class BookService {

private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    // deletes a book   	
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}
	// update a book	
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {	
		
		return null;
	}
	//	update book
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
}
