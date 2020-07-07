package com.springbootdev.examples.microservices.studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;


@RestController
public class StudentController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/name")
	public String getControllerName() {
		return "Student Name From Student Service";
	}

	@GetMapping("/callAddressFromStudent")
//	@HystrixCommand(fallbackMethod = "serviceMayBeDown") // This is usually used in service class OR used where
															// restTemplate is used to communicate with another
															// micro-service
	
	
	
	@HystrixCommand(fallbackMethod = "serviceMayBeDown", commandProperties = {
			   @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
			})
	public String communicate() {

		return restTemplate.getForObject("http://ADDRESS-SERVICE/getAddress", String.class);

	}

	public String serviceMayBeDown() {
		return "Requested Address Service May be down or too busy";
	}

}