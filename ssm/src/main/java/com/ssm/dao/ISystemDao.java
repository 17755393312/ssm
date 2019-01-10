package com.ssm.dao;

import com.ssm.entity.User;

public interface ISystemDao {
	
	User findByName(String name);
}
