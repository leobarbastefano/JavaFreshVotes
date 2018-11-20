package br.com.globits.javafreshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	//@RequestMapping(value="/login", method=RequestMethod.GET)
	// the line below is the same as the above, but simpler
	@GetMapping("login")
	
	public String login() {
		return "login";
	}
	
}
