package cloudProvider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Value("${server.port}")
    private String port;

    public String hiService(String name) {
        return port + name;
    }

}