package com.bucketdev.betappconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BetappConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetappConfigServerApplication.class, args);
	}

}
