package br.com.globits.javafreshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardControler {
//@RequestMapping(value="/", method=RequestMethod.GET)
	// the line below is equivalent to the botton one
@GetMapping("/")

public String rootView()
{
	return "index";
}
}
