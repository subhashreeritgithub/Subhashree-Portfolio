package in.ashokit.service;

import org.springframework.stereotype.Component;

@Component
public class PwdService {
	public String encryptpwd(String pwd) {
		//encrypted logic (MD,SHA,AES,BCRYPTO)
		System.out.println("pwd encryption completed..");
		return pwd;
	}

}
