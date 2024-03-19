package in.ashokit;

import java.beans.Beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.Repo.EmpRepository;
import in.ashokit.entity.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=	SpringApplication.run(Application.class, args);
 EmpRepository bean=context.getBean(EmpRepository.class);
		Employee emp=new Employee();
		emp.setEname("Subha");
		emp.setSalary(345.56);
	   Employee save =bean.save(emp);
		System.out.println("record save sucessfully");
		
		
		
		
	
	}

}