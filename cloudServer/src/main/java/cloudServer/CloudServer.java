package cloudServer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudServer.class).run(args);
    }

}
