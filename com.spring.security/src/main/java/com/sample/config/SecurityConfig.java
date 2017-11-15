package com.sample.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

	@Bean
	public javax.servlet.Filter filter1() {
		return new Filter1();
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(filter1());
		registration.addUrlPatterns("/");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("someFilter");
		registration.setOrder(1);
		return registration;
	}
}
