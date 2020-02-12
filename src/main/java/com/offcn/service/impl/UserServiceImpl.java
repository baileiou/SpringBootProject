package com.offcn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.po.User;
import com.offcn.repository.UserRepository;
import com.offcn.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getUserList() {
		return userRepository.findAll();
	}

	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User getUser(Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public void updateUser(Long id, User user) {
		user.setId(id);
		userRepository.saveAndFlush(user);

	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}