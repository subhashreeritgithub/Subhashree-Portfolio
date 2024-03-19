package in.ashokit.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
	public boolean sendEmail(String to,String subject,String body) {
		//logic to send email
		System.out.println("email sent to user");
		return true;
	}

}
