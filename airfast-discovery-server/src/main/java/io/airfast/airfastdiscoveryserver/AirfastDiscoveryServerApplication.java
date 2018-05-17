package io.airfast.airfastdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AirfastDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirfastDiscoveryServerApplication.class, args);
	}
}
