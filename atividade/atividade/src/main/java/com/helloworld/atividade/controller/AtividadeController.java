package com.helloworld.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frase")
public class AtividadeController {

	@GetMapping 
	public String frase() {
		return "Persistência e Orientação ao Detalhe! \nObjetivos, aprender Spring!!";
	}
}
