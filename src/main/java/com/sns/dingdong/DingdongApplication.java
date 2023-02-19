package com.sns.dingdong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DingdongApplication {

	public static void main(String[] args) {
		SpringApplication.run(DingdongApplication.class, args);
		System.out.println("hello sns");
	}
}
