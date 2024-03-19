package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import in.ashokit.security.AppSecurity;
@ComponentScan(basePackages= {"in.ashokit","com.tcs"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		 SpringApplication.run(Application.class, args);
	
	}
	@Bean
	public AppSecurity createSecurityObj() {
		AppSecurity as=new AppSecurity("SHA-256");
		return as;
	}

}
