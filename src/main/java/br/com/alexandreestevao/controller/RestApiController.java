package br.com.alexandreestevao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
	
	@RequestMapping("/api/hi")
	public String hi() {
		return "Hello world! >>> Message from <a href='https://www.linkedin.com/in/alexandreestevao' target='_blank'>linkedin.com/alexandreestevao</a>";
	}

}
