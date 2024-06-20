package br.com.gov.etesp.gestaoconvidados.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tbl_convidado")
public class ConvidadoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private int numeroAcompanhante;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroAcompanhante() {
		return numeroAcompanhante;
	}

	public void setNumeroAcompanhante(int numeroAcompanhante) {
		this.numeroAcompanhante = numeroAcompanhante;
	}

}
