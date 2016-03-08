package com.zr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zr.dao.UserDaoI;
import com.zr.model.User;

@Service("UserService")
public class UserService {
	@Autowired
	private UserDaoI userDaoI;
	@Transactional(propagation=Propagation.REQUIRES_NEW,
			isolation=Isolation.READ_COMMITTED,
			timeout=3)
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDaoI.userReg(user.getName(), user.getPassword(), user.getRegtime());
	}

}
