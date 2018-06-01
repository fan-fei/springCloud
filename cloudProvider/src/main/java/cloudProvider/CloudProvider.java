package cloudProvider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProvider {

    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider.class, args);
    }

}
