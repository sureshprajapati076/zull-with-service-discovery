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
	
	
	
    @GetMapping("/getStudentName")
    public String getControllerName()
    {
    	
    	
    	
    	String response=restTemplate.getForObject("http://STUDENT-SERVICE/name", String.class);
    	
    	
    	
    	
    	
    	
    	
        return response;
    }
    
    @GetMapping("/getAddress")
    public String getAdd() {
    	
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	return "THIS IS SENT FROM ADDRESS SERVICE";
    }
    
    
    
    
    
    
    
}