package com.scemplogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.scemplogin", "com.common"})
@EnableJpaRepositories(basePackages = {"com.scemplogin.repository", "com.common.repository"})
@EntityScan(basePackages = {"com.scemplogin.entity", "com.common.entity"})
public class ScEmployeeLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScEmployeeLoginApplication.class, args);
	}

}
