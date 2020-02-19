package com.JuegoTrivia.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**Los controladores se hacen de acuerdo a la logica del negocio*/

@Controller
@RequestMapping("inicio")
public class InicioController {

	@GetMapping("")
	public String index() {
		return "./html/inicio";
	}

}
