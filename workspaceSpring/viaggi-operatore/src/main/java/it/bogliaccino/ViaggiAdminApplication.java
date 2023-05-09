package it.bogliaccino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import it.bogliaccino.uploader.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class ViaggiAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViaggiAdminApplication.class, args);
	}

}
