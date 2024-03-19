package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataRestController {
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDB", name = "tunic")
	
	public String getData() {
		System.out.println("redis method call");
		
		int i=10/0;
		
		
		return "Redis data sent to ur emal";
		
	}
	@GetMapping("/data1")
	public String getDataFromDB() {
		System.out.println("Db mthod is called");
		return "DB Data sent to ur emal";
		
	}

}
