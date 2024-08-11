package com.vision.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vision.userservice.config.UserServiceConfiguration;

@RestController
public class UserServiceController {

	@Autowired
	private UserServiceConfiguration configuration;

	@GetMapping("/values")
	public String getAllValues() {
		return configuration.getHost() + ":->" + configuration.getPort() + ":->" + configuration.getUsername() + ":->"
				+ configuration.getPassword();
	}

}
