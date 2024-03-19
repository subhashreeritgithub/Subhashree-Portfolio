package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.WelcomeApiClient;

@RestController
public class GreetRestController {
	@Autowired
	 private  WelcomeApiClient welcomeClient;
	@GetMapping("/greet")
	 public String getGreetMsg() {
	String welcomeMsg=	welcomeClient.invokeWelcomeApi();
		 String greetMsg="Good morning";
		 return  greetMsg.concat(welcomeMsg);
	 }

}
