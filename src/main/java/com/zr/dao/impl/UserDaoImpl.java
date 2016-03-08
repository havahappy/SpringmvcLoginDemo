package com.zr.dao.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zr.dao.UserDaoI;

@Repository("userDaoI")
public class UserDaoImpl implements UserDaoI{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void userReg(String name, String password, Date regtime){
		String sql = "INSERT INTO usera(userName, userPwd, userRegtime) VALUES(?,?,?)";
		jdbcTemplate.update(sql, name, password, regtime);
	}
}
