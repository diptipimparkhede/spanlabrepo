package com.boa.kycprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,MongoRepositoriesAutoConfiguration.class})

@EnableJpaRepositories(basePackages = {"com.boa.kycprocess.*"})
@EnableMongoRepositories(basePackages = {"com.boa.kycprocess.*"})
@EntityScan(basePackages = {"com.boa.kycprocess.*"})

public class KycprocessApplication {

	public static void main(String[] args) {
		SpringApplication.run(KycprocessApplication.class, args);
	}

}
