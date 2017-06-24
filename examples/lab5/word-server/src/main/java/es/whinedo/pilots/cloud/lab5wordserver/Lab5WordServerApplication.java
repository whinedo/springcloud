package es.whinedo.pilots.cloud.lab5wordserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab5WordServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5WordServerApplication.class, args);
	}
}
