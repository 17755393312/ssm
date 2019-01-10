package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.ISystemDao;
import com.ssm.entity.User;
import com.ssm.service.ISystemService;

@Service
public class SystemServiceImpl implements ISystemService {

	@Autowired
	ISystemDao systemDao;
	
	@Override
	public User login(String name, String password) {
		
		return systemDao.findByName(name);
	}

}
