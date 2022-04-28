package io.semillita.hugonet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class HelloWorldController {

	//@GetMapping("/hugo")
	public String helloWorld() {
		return "Hugo";
	}
	
}
