package com.xeon.udp;

import com.xeon.udp.core.EchoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ClientUdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientUdpApplication.class, args);
//		ApplicationContext context = new AnnotationConfigApplicationContext(ClientUdpApplication.class);
//		EchoClient echoServer = context.getBean("echoClient", EchoClient.class);
//		echoServer.run();
	}



}
