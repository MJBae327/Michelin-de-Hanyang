package com.ssafy.michelin_de_hanyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MichelinDeHanyangApplication {

	public static void main(String[] args) {
		SpringApplication.run(MichelinDeHanyangApplication.class, args);
	}
}
