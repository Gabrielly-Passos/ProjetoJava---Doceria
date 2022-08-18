package br.com.doceriafeliz.beans;

public class Brigadeiro extends Doce {

	public double getQuantAchocolatado() {
		return quantAchocolatado;
	}

	public void setQuantAchocolatado(double quantAchocolatado) {
		this.quantAchocolatado = quantAchocolatado;
	}

	private double quantAchocolatado;
	
	
	private Brigadeiro(String recebeNome, double recebeQuantidadeLeiteCondensado, double recebeQuantManteiga, double recebeQuantidadeAchocolatado) {
		super(recebeNome, recebeQuantidadeLeiteCondensado, recebeQuantManteiga);
		setQuantAchocolatado(recebeQuantidadeAchocolatado);
	}
	
	private double quantManteiga
	r

	public double calculaPeso(double pesoEmbalagem) {
		
		double soma = 0;
		
		soma = this.quantAchocolatado + getQuantLeite_Condensado() + getQuantManteiga() + pesoEmbalagem;

		return soma;
	}
}
