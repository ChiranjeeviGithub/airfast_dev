package io.airfast.airfastcatalogclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AirfastCatalogClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirfastCatalogClientApplication.class, args);
	}
}
