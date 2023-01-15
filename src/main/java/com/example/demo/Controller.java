package com.example.demo;

import org.springframework.web.bind.annotation.*;



@RestController
public class Controller {
	
@RequestMapping("/")
		
		
		public String home() {
			return "Hello, i'm testing Github deployment";
}
}

