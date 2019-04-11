package com.landg.phoenix.diary.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

//@slf4j
@Component
public class Sender {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void sendToActiveMq(String destination, String message) {
		
		//log.debug("Sending message ='{}' to destination='{}'",message,destination);
		
		System.out.printf("Sending message ='{}' to destination='{}'",message,destination);
		
		jmsTemplate.convertAndSend(destination,message);
	}

}
