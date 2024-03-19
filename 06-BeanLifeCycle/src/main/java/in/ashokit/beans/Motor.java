package in.ashokit.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Motor {
	@PostConstruct
	public void init() {
		System.out.println("Motor  -init()method...");
	}
   @PreDestroy
	public void destory() {
		System.out.println(" motor  -destory()method...");
	}
}
