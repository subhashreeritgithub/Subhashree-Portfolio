package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.entity.BookPk;
import in.ashokit.repo.BookRepo;
@Service
public class BookService {
	@Autowired
	private BookRepo repo;
	public void saveBook() {
		BookPk pk=new BookPk(101,"java");
		Book entity =new Book(1000.00,"james",pk);
		repo.save(entity);
		
	}
	

}
