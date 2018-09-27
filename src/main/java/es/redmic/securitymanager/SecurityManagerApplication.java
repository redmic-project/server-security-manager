package es.redmic.securitymanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "es.redmic.securitymanager" })
public class SecurityManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityManagerApplication.class, args);
	}
}
