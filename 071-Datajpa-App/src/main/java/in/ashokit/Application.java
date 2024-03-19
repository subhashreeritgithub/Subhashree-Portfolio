package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.book;
import in.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
 ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
 BookRepository bookrepo = context.getBean(BookRepository.class);
 
    book b= new book();
    b.setBookId(2);
    b.setBookName("pytho");
    b.setBookPrice(123.35);
     bookrepo.save(b);
    
  
	}

}
