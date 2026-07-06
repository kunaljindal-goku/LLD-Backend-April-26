package com.scaler.bookMyShow;

import com.scaler.bookMyShow.controller.UserController;
import com.scaler.bookMyShow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowApplication {

	private UserController userController;

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}


}
