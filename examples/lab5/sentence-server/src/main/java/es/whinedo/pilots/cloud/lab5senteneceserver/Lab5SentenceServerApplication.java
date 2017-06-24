package es.whinedo.pilots.cloud.lab5sentenceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab5SentenceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5SentenceServerApplication.class, args);
	}
}
