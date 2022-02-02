package dao;

import java.util.List;

import model.BookModel;

public interface BookDao {
	// read
	List<BookModel> fetchAllBooks();
	
	// create
	BookModel addBook(BookModel bookModel);
	
	// update
	BookModel updateBook(BookModel bookModel);
	
	// delete
	BookModel deleteBook(int bookId);

}
