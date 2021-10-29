package Exercicio1;

import javax.swing.JOptionPane;

public class ClasseTeste {

	public static void main(String[] args) {
		//primeiro proprietario instanciado com construtor obrigatorio
				Proprietario p1 = new Proprietario("Sergio", "371458965465", "345846521");
				System.out.println(p1);
		        JOptionPane.showMessageDialog (null, p1);
	}

}
