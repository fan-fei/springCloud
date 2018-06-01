package cloudConsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cloudConsumer.HelloService.HelloServiceImpl;

@FeignClient(value = "cloud.provider", fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping(value = "/hi/{name}")
    public String hiService(@PathVariable(name = "name") String name);

    @Component
    class HelloServiceImpl implements HelloService {

        public String hiService(String name) {
            return "hystrix";
        }

    }

}