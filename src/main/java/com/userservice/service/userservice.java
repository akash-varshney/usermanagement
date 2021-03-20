package com.userservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 
import com.userservice.dao.userrepo;
import com.userservice.entity.userdetail;

@Service
public class userservice 
{
	@Autowired
	private userrepo repo;
	 
	public userdetail saveuser(userdetail user)
	{
 	    return repo.save(user);
		  
	}
}
