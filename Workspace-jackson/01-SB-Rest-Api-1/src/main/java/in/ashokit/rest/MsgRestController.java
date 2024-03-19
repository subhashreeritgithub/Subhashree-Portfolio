package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
@GetMapping("/msg")	
	public String getMsg() {
		String msg="welcome my home";
		return msg;
	}
@GetMapping("/msg1")
public String getMsg1(@RequestParam("name")String name) {
	String str= name +"good morning";
	return str;
	
}
	

}
