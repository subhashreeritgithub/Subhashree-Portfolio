package in.ashokit.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements IUserDao{

	@Override
	public boolean saveUser(String uname, String email, String pwd) {
		// db logic
		System.out.println("Record inserted in database....");
		return true;
	}
	

}
