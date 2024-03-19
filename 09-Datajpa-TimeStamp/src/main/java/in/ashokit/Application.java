package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Repo.ContactUsRepo;
import in.ashokit.entity.ContactUsEntity;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=SpringApplication.run(Application.class,args);
		 
		 ContactUsRepo bean=context.getBean(ContactUsRepo.class, args) ;
		 ContactUsEntity Entity=new ContactUsEntity();
		 Entity.setCid(1);
		 Entity.setCname("subhashree");
		 Entity.setCphno("8114635385");
		 Entity.setCemail("spdarsini2000@gmail.com");
		 
		 bean.save(Entity);
		 
	}

}
