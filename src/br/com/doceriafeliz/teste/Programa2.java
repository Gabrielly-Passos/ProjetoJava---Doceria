package br.com.doceriafeliz.teste;

import javax.swing.JOptionPane;

import br.com.doceriafeliz.beans.Beijinho;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beijinho beijinho = new Beijinho();
		
		beijinho.setNome(JOptionPane.showInputDialog("Digite o nome do seu beijinho"));
		beijinho.setQuantLeite_Condensado(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de leite condensado")));
		beijinho.setQuantManteiga(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de manteiga")));
		beijinho.setQuantCoco(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de coco")));

		System.out.println("Exibir nome do doce: " + beijinho.getNome() + "\nQuantidade de Leite condensado: "
				+ beijinho.getQuantLeite_Condensado() + "\nQuantidade de manteiga: " + beijinho.getQuantManteiga()
				+ "\nQuantidade de côco: " + beijinho.getQuantCoco());

		System.out.println("\nResultado da soma: " + beijinho.calculaPesoCoco(0.50));

	}

}
