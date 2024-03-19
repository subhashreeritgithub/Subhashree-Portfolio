package in.ashokit.service;



import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.ashokit.entity.UserEntity;
import in.ashokit.repo.UserRepo;


@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired 
		private UserRepo repo;
	
     //retrive the user data....by help of this method ..
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity entity =repo.findByUname(username);
		return new User(entity.getUnmae(),entity.getUpwd(),Collections.emptyList());
		
	}
	
	//save the user data by help of this method 
	
	public boolean svaeUser(UserEntity user) {
		user=repo.save(user);
		return user.getUerid()!=null;
		
	}
	
	


}
