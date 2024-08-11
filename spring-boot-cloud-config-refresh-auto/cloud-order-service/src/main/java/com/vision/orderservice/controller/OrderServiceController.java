package com.vision.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vision.orderservice.config.OrderServiceConfiguration;

@RestController
public class OrderServiceController {

	@Autowired
	private OrderServiceConfiguration configuration;

	@GetMapping("/values")
	public String getAllValues() {
		return configuration.getHost() + ":->" + configuration.getPort() + ":->" + configuration.getUsername() + ":->"
				+ configuration.getPassword();
	}

}
