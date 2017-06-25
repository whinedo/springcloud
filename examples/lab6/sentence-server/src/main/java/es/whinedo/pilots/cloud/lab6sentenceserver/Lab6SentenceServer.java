package es.whinedo.pilots.cloud.lab6sentenceserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Lab6SentenceServer {

    public static void main(String[] args) {
        SpringApplication.run(Lab6SentenceServer.class, args);
    }
}
