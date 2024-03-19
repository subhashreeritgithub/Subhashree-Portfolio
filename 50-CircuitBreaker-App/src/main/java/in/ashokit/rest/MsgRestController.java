package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MsgRestController {
	@GetMapping("/data")
	public String getDataFromRedis() {
		
		
		
		//logic
		
		
		int i=10/0;
		return "Data Fetching from redis";
	}
	@GetMapping("/data1")
	public String getDataFromDB() {
		//logic 
		
		return "Data fetching from DB";
	}

}
