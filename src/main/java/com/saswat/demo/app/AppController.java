package com.saswat.demo.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/test")
	public String test() {
		return "This is test...";
	}
	
}
