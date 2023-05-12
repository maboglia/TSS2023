package it.bogliaccino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@RequestMapping("")
public class ViaggiAdminApplication {

	@GetMapping("test")
	String home() {
		return "prova";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ViaggiAdminApplication.class, args);
	}

}
