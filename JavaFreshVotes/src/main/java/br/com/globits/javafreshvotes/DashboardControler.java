package br.com.globits.javafreshvotes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardControler {
@RequestMapping(value="/", method=RequestMethod.GET)

public String rootView()
{
	return "index";
}
}
