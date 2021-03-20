package com.userservice.controler;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
import com.userservice.entity.userdetail;
import com.userservice.service.userservice;

@RestController
@RequestMapping("/user")
public class usercontroler 
{
	@Autowired
	private userservice service;
	
	@PostMapping("/createuser")
	public userdetail createuser(@RequestBody userdetail user)
	{
		
		return service.saveuser(user);
	}

}
