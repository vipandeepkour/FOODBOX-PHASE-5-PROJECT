package com.simplilearn.foodbox.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.simplilearn.foodbox.entity.User;
import com.simplilearn.foodbox.service.UserService;
@org.springframework.web.bind.annotation.CrossOrigin(origins={"http://localhost:4200"})
@RestController
public class UserController {
@Autowired
private UserService service;
@PostMapping("/adduser")
	public ResponseEntity<Object> addUser(@RequestBody User user)
	{
		User data=service.addUser(user);
		if(data!=null)
		{
			return new ResponseEntity<Object>(user,HttpStatus.CREATED);
		}
		else
			return new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	}
@GetMapping("/getuser")
	public List<User> getAllUsers()
	{
		return service.getAllUSers();
	}
@GetMapping("/{id}")
	public ResponseEntity<Object> getUserById(@PathVariable int id)
	{
		User Object=service.getUserById(id);
		if(Object!=null)
		{
			return new ResponseEntity<Object>(Object,HttpStatus.FOUND);
		}
	else
		return new ResponseEntity<Object>("No user found",HttpStatus.NOT_FOUND);	
}
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteUserById(@PathVariable int id)
{
	if(service.deleteUser(id))
	{
		return new ResponseEntity<String>("User deleted",HttpStatus.OK);
	
}
	else
		return new ResponseEntity<String>("No User found", HttpStatus.NOT_FOUND);
}
}



