package br.com.gov.etesp.gestaoconvidados.model;

public class Convidado {

	private Long id;
	private String nome;
	private int acompanhante;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAcompanhante() {
		return acompanhante;
	}
	public void setAcompanhante(int acompanhante) {
		this.acompanhante = acompanhante;
	}
	
	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", acompanhante=" + acompanhante + "]";
	}
}
