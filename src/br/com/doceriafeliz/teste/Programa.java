package br.com.doceriafeliz.teste;

import javax.swing.JOptionPane;

import br.com.doceriafeliz.beans.Brigadeiro;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Brigadeiro brigadeiro = new Brigadeiro();

		brigadeiro.setNome(JOptionPane.showInputDialog("Digite o nome do brigadeiro"));
		brigadeiro.setQuantAchocolatado(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de achocolatado")));
		brigadeiro.setQuantManteiga(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de manteiga")));
		brigadeiro.setQuantLeite_Condensado(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de leite condensado")));
		;

		System.out.println("Exibir nome do doce: " + brigadeiro.getNome() + "\nQuantidade de Leite condensado: "
				+ brigadeiro.getQuantLeite_Condensado() + "\nQuantidade de manteiga: " + brigadeiro.getQuantManteiga()
				+ "\nQuantidade de Achocolatado: " + brigadeiro.getQuantAchocolatado());

		System.out.println("\nResultado da soma: " + brigadeiro.calculaPeso(0.15));

		
		
	}

}
