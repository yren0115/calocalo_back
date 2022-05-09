package jp.co.calocalo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/submit/food")
		public String test() {
			return "test";
		}
}
