package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.AuthRequest;
import in.ashokit.entity.UserEntity;
import in.ashokit.service.MyUserDetailsService;

@RestController
@RequestMapping("/api")
public class UserController {
	//register
	@Autowired
	private MyUserDetailsService service;
	@Autowired
	private PasswordEncoder encoder;
	@Autowired
	private AuthenticationManager  authmanager;
	
	private String valid;
	private String invalid;
	
	
	@PostMapping("/register")
	  public String registerUser(UserEntity user) {
		
	// password making here....linking with appconig class
	
		
   String encodedPwd=encoder.encode(user.getUpwd());
   user.setUpwd(encodedPwd);
   
		boolean saveUser = service.svaeUser(user);
		if(saveUser) {
			return "User Registered";
		}else {
			return "Registartion Failed";
		
					
		}
		
	}
	
	//login
	@PostMapping("/login")
	public String userAuthentication(AuthRequest request) {
		
		UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(request.getUname(),request.getPwd());
	try {	
		Authentication auth =authmanager.authenticate(token);
		
		if(auth.isAuthenticated()) {
			//gegenraeted jwt token and user
			return valid ;
		}
	}catch(Exception e) {
		e.printStackTrace()	;
		} {
			return "authentication failed";
		}
		
				
	}
	
	   
	
	//welcome
   
}
