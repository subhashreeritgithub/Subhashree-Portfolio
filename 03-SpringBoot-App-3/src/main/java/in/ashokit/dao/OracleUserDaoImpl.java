package in.ashokit.dao;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleUserDaoImpl  implements UserDao{
	public OracleUserDaoImpl() {
		System.out.println("oracleUsrDaoIMpl::constructore");
	}

	@Override
	public String findNameById(Integer id) {
		if(id==100) {
			return"raju";
			
		}else if(id==200) {
			return "rani"; 
		}
		return null;
	}
	

}
