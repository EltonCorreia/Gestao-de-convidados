package br.com.gov.etesp.gestaoconvidados.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String abrirTelaLogin() {
		return "login";
	}
	
	@PostMapping("/autenticar")
	public String autenticar(String login, String senha) {
		if(login.equals("admin") && senha.equals("admin")) {
			return "redirect:/convidados";
		}
		else {
			return "redirect:/";
		}
	}
	
}
