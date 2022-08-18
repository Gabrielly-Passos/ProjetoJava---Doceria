package br.com.doceriafeliz.beans;

public class Doce {

	private String nome;
	private double quantLeite_Condensado;
	
	private double quantManteiga;
	
	Doce(String recebeNome, double recebeQuantidadeLeiteCondensado, double recebeQuantManteiga) {
		setNome (recebeNome);
		setQuantLeite_Condensado (recebeQuantidadeLeiteCondensado); 
		setQuantManteiga(recebeQuantManteiga);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQuantLeite_Condensado() {
		return quantLeite_Condensado;
	}

	public void setQuantLeite_Condensado(double quantLeite_Condensado) {
		this.quantLeite_Condensado = quantLeite_Condensado;
	}

	public double getQuantManteiga() {
		return quantManteiga;
	}

	public void setQuantManteiga(double quantManteiga) {
		this.quantManteiga = quantManteiga;
	}
}
