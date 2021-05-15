package com.elkay.auctionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AuctionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionDemoApplication.class, args);
	}

}
