package com.simplilearn.foodbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.foodbox.entity.User;
import com.simplilearn.foodbox.repo.UserRepo;
@Service
public class UserService {
@Autowired
private UserRepo urepo;
public User addUser(User user) {
return urepo.save(user);
}
public List<User> getAllUSers(){
	return urepo.findAll();
}
public User getUserById(int id) {
	if
	(urepo.findById(id) .isPresent())
	{
		return urepo.findById(id).get();
	}
		else
		{
			return null;
		}
	}
	public boolean deleteUser(int id)
	{
		if
		(urepo.findById(id).isPresent())
		{
		 urepo.deleteById(id);
		 return true;
		}
		else
		{
			return false;
		}
}
}

