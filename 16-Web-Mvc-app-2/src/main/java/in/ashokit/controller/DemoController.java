package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


//queryparameter
@Controller
public class DemoController {
	@GetMapping("/msg")
	public ModelAndView getMsg1(@RequestParam("name")String name) {
		String msg="hello, "+name;
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg1",msg);
		mav.setViewName("index");
		return mav;
		
	}
	
	//pathparameter
@GetMapping("/msg1{name}")
public ModelAndView getMsg2( @PathVariable("name") String name) {
	
 ModelAndView mav= new ModelAndView();
	String textmsg="Good morning,"+name;
	mav.addObject("msg2",textmsg);
	mav.setViewName("index");
	return mav;
	
}


//another way to write the Controller pattren (model take as a parametre here)


@GetMapping("/msg2")
 public String getMsg3( Model model) {
	model.addAttribute("msg3","hello, how are u?");
	return "index";
	 
 }



//here get the direct msg bcz of responsebody annotation
@GetMapping("/msg3")
@ResponseBody
     public String getMsg() {
    	 return "welcome our home";
     }











	

}
