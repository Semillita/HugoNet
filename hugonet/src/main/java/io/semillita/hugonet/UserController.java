package io.semillita.hugonet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController {

	@GetMapping("/user/{username}")
	public User getName(@PathVariable(value="username") final String username) {
		return new User(username);
	}
	
}
