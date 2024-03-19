package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
@GetMapping("/welcome")	
	 public String getWelcomeMsg(Model model) {
	  model.addAttribute("msg1","welcome our sweeat home");
	  int i=10/0;
	  return "index";
		 
	 }
//handle the exception here
@ExceptionHandler(value = Exception.class)
 public String handleException(Exception e) {
	  System.out.println(e.getMessage());
	   return "error";
 }
//here the Exceptionhandler present in the particular controller so it is called local exception handler.
}
