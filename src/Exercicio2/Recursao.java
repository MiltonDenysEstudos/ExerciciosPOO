package Exercicio2;

public class Recursao {

	public int numerosNaturaisOrdemCrescente(int n) {
		System.out.println(n);
		if (n >= 100) {
			return 1;
		} else {
			return numerosNaturaisOrdemCrescente(n + 1);
		}

	}
	public int somaNumerosNaturais(int n) {
		if(n!=0) {
			return n+somaNumerosNaturais(n-1);
		}else {
		return n;
		}
	}
	public void mostraVetorRecursivamente(int dados[],int index) {
		if(index !=-1) {
			mostraVetorRecursivamente(dados,index - 1);
			System.out.println(dados[index]);

		}
		
	}
	public static void main(String[] args) {
		Recursao recursao = new Recursao();
		//recursao.numerosNaturaisOrdemCrescente(10);
		int resultadoRecursaoNaturais = recursao.somaNumerosNaturais(10);
		//System.out.println(resultadoRecursaoNaturais);
		int[]dadosVetor = {51,68,20,1,7,96,54,744};
		recursao.mostraVetorRecursivamente(dadosVetor,dadosVetor.length -1 );
		
	}

}
