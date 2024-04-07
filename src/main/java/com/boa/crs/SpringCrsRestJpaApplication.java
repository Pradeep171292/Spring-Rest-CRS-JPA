package com.boa.crs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableJpaRepositories("com.boa.crs.repo")
@EntityScan("com.boa.crs.entity")
@ComponentScan("com.boa.crs.*")
@EnableWebMvc
@EnableAutoConfiguration
@SpringBootApplication
public class SpringCrsRestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrsRestJpaApplication.class, args);
	}

}
