package org.sara.infoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("org.sara.infoservice.entities")
public class InfoServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(InfoServiceApplication.class, args);
	}

}
