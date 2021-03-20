package com.userservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userservice.entity.userdetail;

public interface userrepo extends JpaRepository<userdetail, Integer>
{
  
}
