package com.alireza.springsoa.service;

import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

	@Override
	public String log(String message) {
		String log = "Log: " + message;
		System.out.println(log);
		return log;
	}

}
