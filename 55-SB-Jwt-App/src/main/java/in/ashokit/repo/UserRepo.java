package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.UserEntity;

public interface UserRepo  extends JpaRepository<UserEntity ,Integer>{

//select * from user_tbl where uname=:uname
	
   public UserEntity findByUname(String unmae);
 
}
