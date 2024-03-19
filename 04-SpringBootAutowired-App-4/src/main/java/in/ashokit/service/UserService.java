package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ashokit.dao.IUserDao;

@Component
public class UserService {
	
@Autowired
	private PwdService PwdService;
	@Autowired
	private EmailService EmailService;
	@Autowired
	private IUserDao userDao;
	

	public void registerUser(String name,String email,String pwd) {
		//encrypted password 
	 String encryptpwd = PwdService.encryptpwd(pwd);
		//save user in db
	  boolean isSaved=userDao.saveUser(name,email,encryptpwd);
		//send email
	  if(isSaved) {
	 boolean isSent=EmailService.sendEmail(email,"Test subject","Test body");
		if(isSent) {
			System.out.println("User Registration completed......");
		}
	  }
	}

}
