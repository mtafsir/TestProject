package com.Practice.demo.HelloWorld.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

//manage by spring
//Talks to the database
@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	private static int usersCount = 3;
	
	static {
		users.add(new User(1,"Adam",new Date()));
		users.add(new User(2,"Eve",new Date()));
		users.add(new User(3,"Jack",new Date()));
		
	}//end of static
	
	//public List<User> findAll()
	public List<User> findAll() {
		return users;
		
	}
	//public User save(User user)
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
			
		}
		
		users.add(user);
		return user;
	}
	
	//public User findOne(int id)
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id)
			{
				return user;
			}
			
		}
		return null;
	}
	
}
