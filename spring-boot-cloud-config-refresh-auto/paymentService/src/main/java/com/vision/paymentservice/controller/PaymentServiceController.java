package com.vision.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vision.paymentservice.config.PaymentServiceConfiguration;

@RestController
public class PaymentServiceController {

	@Autowired
	private PaymentServiceConfiguration configuration;

	@GetMapping("/values")
	public String getAllValues() {
		return configuration.getHost() + ":->" + configuration.getPort() + ":->" + configuration.getUsername() + ":->"
				+ configuration.getPassword();
	}

}
