package com.alireza.springsoa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alireza.springsoa.iface.NotificationRestInterface;
import com.alireza.springsoa.service.LogServiceImpl;
import com.alireza.springsoa.service.NotificationService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringSoaAppApplicationTests {

	@Mock
	private NotificationService mockService;

	@InjectMocks
	private NotificationRestInterface restInterface;

	@Spy
	private final LogServiceImpl logService = new LogServiceImpl();

	@Test
	public void notificationService_happyPath() {

		String mockResponse = "mynotify";
		Mockito.when(mockService.getLastNotification())
				.thenReturn(mockResponse);

		String lastNotification = restInterface.getLastNotification();
		org.junit.Assert.assertEquals("Notification: " + mockResponse,
				lastNotification);
	}

}
