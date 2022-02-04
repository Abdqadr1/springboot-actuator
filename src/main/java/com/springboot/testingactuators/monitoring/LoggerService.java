package com.springboot.testingactuators.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements HealthIndicator {
    private final String LOGGER_SERVICE = "LoggerService";
    @Override
    public Health health() {
        if(isLoggerServiceUp()){
            return Health.up()
                    .withDetail(LOGGER_SERVICE, "Logger service is up and running")
                    .withDetail("name", "LOGGER LOGGER")
                    .build();
        }
        return Health.down()
                .withDetail(LOGGER_SERVICE, "Logger service is down")
                .withDetail("name", "LOGGER LOGGER")
                .build();
    }

    /** This method is not required, you can write all the logic in the above method
     * You can use this method to check any required component if they are working
     * properly
     * */
    private boolean isLoggerServiceUp(){
        // write logic here
        return false;
    }

}
