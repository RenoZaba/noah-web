package br.com.noah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
	@RequestMapping("/main")
	public String execute() {
		System.out.println("Executando um seviço com o Spring MVC");
		return "login";
	}
}
