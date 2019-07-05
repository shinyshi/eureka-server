package demo.spring.cloud.eurakaserverbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakaServerBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakaServerBasicApplication.class, args);
    }

}
