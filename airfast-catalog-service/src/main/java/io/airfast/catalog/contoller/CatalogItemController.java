/**
 * 
 */
package io.airfast.catalog.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 677644
 *
 */
@RestController
public class CatalogItemController {

	@Value("${instance.port.name}")
	private String instance;
		
	@RequestMapping("/addCartItem")
	public String addCartItem(){
		System.out.println("Method ");
		return "Cart item is sucessfull :----> "+ instance;
	}
}
