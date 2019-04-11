package com.landg.phoenix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan("com.landg.phoenix")
@EnableDiscoveryClient
@EnableFeignClients
@EnableJms
public class DiaryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiaryServiceApplication.class, args);
	}

}
