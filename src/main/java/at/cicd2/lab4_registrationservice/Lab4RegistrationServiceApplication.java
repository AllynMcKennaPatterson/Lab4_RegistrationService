package at.cicd2.lab4_registrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Lab4RegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4RegistrationServiceApplication.class, args);
	}

}
