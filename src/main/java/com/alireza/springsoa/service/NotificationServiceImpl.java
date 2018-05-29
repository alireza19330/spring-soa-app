package com.alireza.springsoa.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

	/* (non-Javadoc)
	 * @see com.alireza.springsoa.service.NotificationService#getLastNotification()
	 */
	@Override
	public String getLastNotification() {
		return "lastNotification";
	}

}
