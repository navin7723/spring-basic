package com.techprimers.db.service;
//doubt
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.techprimers.db.domain.User;
import com.techprimers.db.model.Users;
//doubt
import com.techprimers.db.repository.UsersRepository;

@Service
public class UserService {
	
	@Autowired
	
	private UsersRepository repo;
  
  public Users login(String userName, String password) {
//	doubt
	  Users users = repo.findByUserNameAndPassword(userName, password);
  	return users;
  }

}
