package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	@GetMapping("/msg")
	public String getMsg() {
		
		return "sucessful gt msg";
		
	}
	@GetMapping("/msg1")
	public String greetMsg() {
		return "greet msg return";
	}
	@GetMapping("/contact")
	public String getContact() {
		
		return "99937910175";
	}

}
  