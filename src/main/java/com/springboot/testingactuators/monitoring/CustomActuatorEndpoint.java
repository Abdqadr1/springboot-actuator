package com.springboot.testingactuators.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * To create a custom actuator endpoint. You have to annotate the class with @Endpoint with id Property
 * you also need the @Component for spring to be aware of the class and create its instance for us
 * */
@Endpoint(id = "custom-endpoint")
@Component
public class CustomActuatorEndpoint {

    /**
     *  You can annotate the method with either @ReadOperation, @WriteOperation or @DeleteOperation
     *  You can also get the parameters passed to the url
     * */
    @ReadOperation
    public Map<String, String> customEnd(String name){
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("name", name);
        return map;
    }

}
