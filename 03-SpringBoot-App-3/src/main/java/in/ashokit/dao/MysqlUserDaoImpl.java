package in.ashokit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mysql")

public class MysqlUserDaoImpl  implements UserDao{
	private UserDao dao; 
	@Autowired
	public  MysqlUserDaoImpl () {
		System.out.println("MysqlUserDaoImpl ::constructore");
	}
	@Autowired
	public void setDao(UserDao dao) {
		System.out.println("Userservice ::setDao()called..");
		this.dao=dao;
	}
 public void getUserName(Integer id) {
	 String name=dao.findNameById(id);
	 System.out.println(name);
	 
}
@Override
public String findNameById(Integer id) {
	// TODO Auto-generated method stub
	return null;
}
}
