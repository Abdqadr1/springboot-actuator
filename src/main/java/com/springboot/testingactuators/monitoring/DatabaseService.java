package com.springboot.testingactuators.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements HealthIndicator {
    private final String DB_SERVICE = "DatabaseService";
    @Override
    public Health health() {
        if(getDatabaseHealth()){
            return Health.up()
                    .withDetail(DB_SERVICE, "Database is up and running")
                    .withDetail("name", "MYSQL DB")
                    .build();
        }
        return Health.down()
                .withDetail(DB_SERVICE, "Database is down")
                .withDetail("name", "MYSQL DB")
                .build();
    }

    /** This method is not required, you can write all the logic in the above method
     * You can use this method to check any required component if they are working
     * properly
     * */
    private boolean getDatabaseHealth(){
        // write logic here
        return true;
    }

}
