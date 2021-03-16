package com.helloworld.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivosController {

	@GetMapping 
	public String objetivo() {
		return "Objetivos, aprender Spring!!";
	}
}