package com.offcn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.offcn.po.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);	
	User findByNameAndAge(String name,Integer age);
}