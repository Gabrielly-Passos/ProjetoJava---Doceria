package br.com.doceriafeliz.beans;

public class Beijinho extends Doce {
	
	private double quantCoco;

	public double getQuantCoco() {
		return quantCoco;
	}

	public void setQuantCoco(double quantCoco) {
		this.quantCoco = quantCoco;
	}
	
public double calculaPesoCoco(double pesoEmbalagem) {
		
		double somar = 0;
		
		somar = this.quantCoco + getQuantLeite_Condensado() + getQuantManteiga() + pesoEmbalagem;

		return somar;}

}
