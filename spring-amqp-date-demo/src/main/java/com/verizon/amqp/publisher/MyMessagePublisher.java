package com.verizon.amqp.publisher;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMessagePublisher {
	
	
	public static void main(String args[])
	{
		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		
		AmqpTemplate template = ctx.getBean(RabbitTemplate.class);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    //Date date = new Date(); 
		for(int i=0;;i++)
		{
			/*String message = "Hello Everybody! msg#" +i;
			System.out.print("Sending messages"+i+".....");
			template.convertAndSend(message);
			System.out.println("sent!");*/
			   Date date = new Date();
               String message=formatter.format(date);
               System.out.print("Sending dates.....");
		       System.out.println("sent!");
		       template.convertAndSend(message);
		       try {
					Thread.sleep(5000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
		}
		
		
		
	}

}
