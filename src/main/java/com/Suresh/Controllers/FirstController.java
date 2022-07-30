package com.Suresh.Controllers;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class FirstController {

	//Approach - 1 ResponseEntity<Void>
	//@GetMapping("/redirect")
	public ResponseEntity<Void> getMessage() {
		 return ResponseEntity.
				 status(HttpStatus.FOUND)
				 .location(URI.create("https://mvnrepository.com/artifact/org.apache.tomcat.embed/tomcat-embed-jasper/9.0.54"))
				 .build();
				 
	}
	@GetMapping("/")
	public String loadForm() {
		return "NewFile";
	}
	
	//Approach - 2 RedirectView
	@GetMapping("/redirect")
	public RedirectView getGo() {
		
		RedirectView rd = new RedirectView();
		rd.setUrl("https://www.javatpoint.com/using-feign-rest-client-for-service-invocation");
		
		return rd;
	}
	
}
