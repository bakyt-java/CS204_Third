package kg.alatoo.edu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class Cs204ThirsdProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cs204ThirsdProjectApplication.class, args);
	}
	@GetMapping("/hello")
	public String helloWorld() {

		return "Hello World !";

	}




}
