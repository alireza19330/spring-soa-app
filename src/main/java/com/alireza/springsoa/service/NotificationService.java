package com.alireza.springsoa.service;

import javax.ws.rs.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationService {
	
	@GET
	@RequestMapping("/notifications")
	public String getLastNotification() {
		return "lastNotification";
	}
	
}
