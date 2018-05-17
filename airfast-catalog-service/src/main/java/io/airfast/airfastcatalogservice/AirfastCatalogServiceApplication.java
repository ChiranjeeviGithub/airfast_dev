package io.airfast.airfastcatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("io.airfast")
public class AirfastCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirfastCatalogServiceApplication.class, args);
	}
}
