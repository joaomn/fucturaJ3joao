package br.com.fuctura.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jogador")
public class Jogador {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String img;
	private String posicao;
	
	
	public Jogador(String nome) {
		System.out.println("Construindo uma instancia do Jogador: " + nome);
		this.nome = nome;
	}
	
	
	
}
