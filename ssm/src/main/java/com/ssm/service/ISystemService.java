package com.ssm.service;

import org.springframework.stereotype.Service;

import com.ssm.entity.User;

@Service
public interface ISystemService {

	User login(String name, String password);
}
