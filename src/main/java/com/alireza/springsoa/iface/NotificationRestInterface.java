package com.alireza.springsoa.iface;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alireza.springsoa.service.NotificationService;

@RestController
public class NotificationRestInterface {
	
	@Autowired
	private NotificationService notificationService;
	
	@GET
	@RequestMapping("/notifications")
	public String getLastNotification() {
		return "Notification: " + notificationService.getLastNotification();
	}
	
}
