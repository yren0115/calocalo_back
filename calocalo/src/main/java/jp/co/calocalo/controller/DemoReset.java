package jp.co.calocalo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoReset {

		
	
	@GetMapping("/")
	public String reset() {
		return "demo/DemoReset";
	}
	
	
	

	

}
