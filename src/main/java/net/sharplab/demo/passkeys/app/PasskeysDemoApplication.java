package net.sharplab.demo.passkeys.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("net.sharplab.demo.passkeys.app.config")
@SpringBootApplication
public class PasskeysDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasskeysDemoApplication.class, args);
	}

}
