package com.alireza.springsoa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alireza.springsoa.service.NotificationService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringSoaAppApplicationTests {
	
	@Mock
	private NotificationService service2;

	@Test
	public void contextLoads() {
		Mockito.when(service2.getLastNotification()).thenReturn("mynotify");
		String lastNotification = service2.getLastNotification();
		org.junit.Assert.assertNotNull(lastNotification);
	}

}
