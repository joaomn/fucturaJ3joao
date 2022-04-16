package br.com.fuctura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fuctura.model.Jogador;

@Controller
public class OlaMundoController {

	@GetMapping("/inicial")
	public String getInicial(Model model) {

		Jogador j = new Jogador();

		j.setNome("Messi");
		j.setAltura(1.78);
		j.setIdade(32);
		j.setPeso(92.3);
		j.setImg("https://static-wp-tor15-prd.torcedores.com/wp-content/uploads/2021/07/messi-barcelona-la-liga-photo-by-eric-alonso-507x338.jpg");
		
		model.addAttribute("jogador" , j);
		model.addAttribute("tituloDaPagina" , "Fuctura");

		return "inicial";

	}

	@GetMapping("/pagina/outra")
	public String getOutra() {
		return "cadastrar";
	}
}
