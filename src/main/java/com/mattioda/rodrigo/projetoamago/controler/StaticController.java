package com.mattioda.rodrigo.projetoamago.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticController {	
	
	@RequestMapping(method=RequestMethod.GET, path="/")
	public String inicioSite() {
		return "index";
	}	
	
	@RequestMapping(method=RequestMethod.GET, path="/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/generic")
	public String generic() {
		return "generic";
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/elements")
	public String elements() {
		return "elements";
	}
	@RequestMapping(method=RequestMethod.GET, path="/register")
	public String getRegister() {
		return "register";
	}
	
	
}
