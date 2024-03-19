package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepositiry;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(Application.class, args);
		BookRepositiry bookRepo = context.getBean(BookRepositiry.class);
		
		Book b= new Book();
		b.setBookId(101);
		b.setBookName("java");
		b.setBookPrice(122.50);
		bookRepo.save(b);
		
	}
	

} 
