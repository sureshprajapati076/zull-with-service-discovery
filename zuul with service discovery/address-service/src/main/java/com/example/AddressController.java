package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AddressController
{
	@Autowired
	RestTemplate restTemplate;
	
	
	
    @GetMapping("/address")
    public String getControllerName()
    {
    	
    	
    	
    	String response=restTemplate.getForObject("http://STUDENT-SERVICE/name", String.class);
    	
    	
    	
    	
    	
    	
    	
        return response;
    }
    
    @GetMapping("/sendtostudent")
    public String getAdd() {
    	return "THIS IS SENT FROM ADDRESS SERVICE";
    }
    
    
    
    
    
    
    
}