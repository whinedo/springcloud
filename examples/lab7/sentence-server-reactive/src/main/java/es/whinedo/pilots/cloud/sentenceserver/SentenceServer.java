package es.whinedo.pilots.cloud.sentenceserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class SentenceServer {

    public static void main(String[] args) {
        SpringApplication.run(SentenceServer.class, args);
    }

    /** 
     * A source of threads.
     */
    @Bean
    public Executor executor() {
        return Executors.newFixedThreadPool(6);
    }   

}
