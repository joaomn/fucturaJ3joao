package br.com.fuctura.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fuctura.model.Jogador;
import br.com.fuctura.repository.JogadorRepository;

@Controller
public class JogadorController {

	@Autowired
	JogadorRepository repository;

	@GetMapping("/jogador/cadastrar")
	public String cadstro() {
		return "cadastrar";
	}

	@GetMapping("/jogador/listar")
	public String lista(Model model) {

		Optional<Jogador> jogador = repository.findById(1L);

		if (jogador.isPresent()) {
			model.addAttribute("jogador", jogador.get());
		}


		return "listar";
	}
	
	
	@GetMapping("/jogador/listar/todos")
	public String listaTodos(Model model) {

		List<Jogador> jogador = repository.findAll();

	
		model.addAttribute("jogadores", jogador);


		return "listarTodos";
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
