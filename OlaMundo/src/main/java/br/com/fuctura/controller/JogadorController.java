package br.com.fuctura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JogadorController {
	
	@GetMapping("/jogador/cadastrar")
	public String cadstro() {
		return "cadastrar";
	}
	
	@GetMapping("/jogador/listar")
	public String lista() {
		return "listar";
	}

	@GetMapping("/jogador/excluir")
	public String escluir() {
		return "excluir";
		
	}
	
	
	@GetMapping("/jogador/atualizar")
	public String atualizar() {
		return "atualizar";
	}
}
