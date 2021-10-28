package Exercicio1;

import javax.swing.JOptionPane;

public class Carro {

	//atributos da classe Carro
	private String modelo, cor, ano, marca, chassi, numPortas, numMarchas;
	private int velocidadeAtual;
	private boolean cambioAutomatico;
	
	//construtor padrao
	public Carro(String modelo, String cor, String ano, String marca, String chassi, int velocidadeAtual,
			String numPortas, String numMarchas, boolean cambioAutomatico) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.chassi = chassi;
		this.velocidadeAtual = velocidadeAtual;
		this.numPortas = numPortas;
		this.numMarchas = numMarchas;
		this.cambioAutomatico = cambioAutomatico;
	}
	
	//encapsulamento com métodos de acesso
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public int  getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public String getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(String numPortas) {
		this.numPortas = numPortas;
	}
	public String getNumMarchas() {
		return numMarchas;
	}
	public void setNumMarchas(String numMarchas) {
		this.numMarchas = numMarchas;
	}
	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}
	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	//To String
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", marca=" + marca + ", chassi=" + chassi
				+ ", velocidadeAtual=" + velocidadeAtual + "km/h" + ", numPortas=" + numPortas + ", numMarchas=" + numMarchas
				+ ", cambioAutomatico=" + cambioAutomatico + "]";
	}
	
	//metodo para aumentar a velocidade de 1 em e km/h
	public void acelera() {
		velocidadeAtual = velocidadeAtual+1;
	}
	
	//metodo para o carro 
	public void freia() {
		velocidadeAtual = 0;
	}
	
	//classe de teste
	public static void main(String []args) {
		//Carro instanciado 
		Carro carro = new Carro("MONTANA COMBO 1.4 8V ECONOFLEX","Marrom","2008","GM - Chevrolet","34V MCPnH4 v3 gF3259",0,"4 portas","5 marchas",true);
		//chamado metodo acelera 2x
		carro.acelera();
		carro.acelera();
        JOptionPane.showMessageDialog (null, carro);
        //chamado metodo de freiar carro
        carro.freia();
        JOptionPane.showMessageDialog (null, carro);
        
	}
}
