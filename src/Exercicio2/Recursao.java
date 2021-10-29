package Exercicio2;

public class Recursao {

	//metodo para imprimir numeros naturais
	public int numerosNaturaisOrdemCrescente(int n) {
		System.out.println(n);
		//condicao para limitar numero maximo para a contagem
		if (n >= 100) {
			return 1;
		} else {
			return numerosNaturaisOrdemCrescente(n + 1);
		}

	}
	//metodo para somar numeros naturais
	public int somaNumerosNaturais(int n) {
		if(n!=0) {
			return n+somaNumerosNaturais(n-1);
		}else {
		return n;
		}
	}
	//metodo para mostrar vetor de forma recursiva
	public void mostraVetorRecursivamente(int dados[],int index) {
		if(index !=-1) {
			mostraVetorRecursivamente(dados,index - 1);
			System.out.println(dados[index]);

		}
		
	}
	//classe de teste
	public static void main(String[] args) {
		Recursao recursao = new Recursao();
		//chamada para o metodo de ordenar números naturais de forma crescente passando o parametro
		System.out.println("Começo Exercicio 1");
		recursao.numerosNaturaisOrdemCrescente(10);
		System.out.println("Fim do Exercicio 1");
		System.out.println("======================================================================");
		
		//chamada para o metodo de somar números naturais passando o parametro
		int resultadoRecursaoNaturais = recursao.somaNumerosNaturais(10);
		System.out.println("Começo Exercicio 2");
		System.out.println(resultadoRecursaoNaturais);
		System.out.println("Fim do Exercicio 2");

		//chamada para o metodo que exibe vetores de forma recursiva
		int[]dadosVetor = {51,68,20,1,7,96,54,744};
		System.out.println("======================================================================");
		System.out.println("Começo Exercicio 3");
		recursao.mostraVetorRecursivamente(dadosVetor,dadosVetor.length -1 );
		System.out.println("Fim do Exercicio 3");

	}

}
