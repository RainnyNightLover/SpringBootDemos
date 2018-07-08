package com.xihuanyuye;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

@Service("producer2")
public class Producer2 {

	@Autowired
	private JmsMessagingTemplate jmsTemplate;
	
	public void sendMessage(Destination destination, final String message){
		jmsTemplate.convertAndSend(destination, message);
	}
	
	@JmsListener(destination="out.queue")
	public void consumerMessage(String text){
		System.out.println("从out.queue队列收到的回复报文为:"+text);
	}
	
}
