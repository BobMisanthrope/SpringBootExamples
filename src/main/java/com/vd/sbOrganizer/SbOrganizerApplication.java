package com.vd.sbOrganizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.vd.sbOrganizer")
@EnableJpaRepositories(basePackages = "com.vd.sbOrganizer")

public class SbOrganizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbOrganizerApplication.class, args);
	}

}