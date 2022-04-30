package br.com.fuctura.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fuctura.model.Jogador;
import br.com.fuctura.repository.JogadorRepository;

@Controller
public class JogadorController {

	@Autowired
	JogadorRepository repository;
	
	@Autowired
	Jogador jog;
	
	
	@RequestMapping(value= "/jogador/cadastrar", method=RequestMethod.GET)
	public String cadstro() {
		
		
		return "cadastrar";
	}

	@RequestMapping(value= "/jogador/cadastrar", method=RequestMethod.POST)
	public String cadstro(Jogador jogador) {
		
		repository.save(jogador);
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
	
	@GetMapping("/jogador/teste")
	public String testeBean() {
		System.out.println(jog.getNome());
		return "outra";
	}
}
