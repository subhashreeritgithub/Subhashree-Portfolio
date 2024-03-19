package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.ashokit.dao.UserDao;

@Component
public class UserService {
	private UserDao dao; 
	@Autowired
	@Qualifier("mysql")
	public void setDao(UserDao dao) {
		System.out.println("Userservice ::setDao()called..");
		this.dao=dao;
	}
 public void getUserName(Integer id) {
	 String name=dao.findNameById(id);
	 System.out.println(name);
	 
 }
}
