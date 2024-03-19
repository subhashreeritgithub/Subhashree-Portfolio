package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.security.AppSecurity;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig:: construvore");
	}
	@Bean
	public AppSecurity createSecurityObj() {
		AppSecurity as=new AppSecurity("SHA-256");
		return as;
	}

}
