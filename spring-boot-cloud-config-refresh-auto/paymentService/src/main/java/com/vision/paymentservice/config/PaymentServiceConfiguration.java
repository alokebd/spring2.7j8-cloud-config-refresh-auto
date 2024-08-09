package com.vision.paymentservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "applicationconfigutation")
@Configuration
@RefreshScope
public class PaymentServiceConfiguration {

	/*
	 * The prefix of configuration comes from the root property name which in GIT repository as below:
	 * 
	 * applicationconfigutation:
  			host: http://localhost
  			port: 3305
  			username: payment-dev-updated-final
 			password: payment-dev-updated-final
	 * 
	 */
	private String host;

	private int port;

	private String username;

	private String password;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
