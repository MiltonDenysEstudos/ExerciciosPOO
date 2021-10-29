package Exercicio1;
import javax.swing.*;
public class Proprietario {
	
	//atributos da classe proprietario
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	//costrutor atributos obrigatorios
	public Proprietario(String nome, String cpf, String rg) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	//construtor padrao
	public Proprietario(String nome, String cpf, String rg, String dataNascimento, String rua, String bairro,
			String cidade, String estado, String cep, String complemento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.complemento = complemento;
	}
	
	//encapsulamento com métodos de acesso
	public String complemento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento
				+ ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep
				+ ", complemento=" + complemento + "]";
	}
	
	//classe de teste
	public static void main(String []args) {
		//primeiro proprietario instanciado com construtor obrigatorio
		Proprietario p1 = new Proprietario("Sergio", "371458965465", "345846521");
		System.out.println(p1);
        JOptionPane.showMessageDialog (null, p1);

        //segundo proprietario instanciado com construtor padrao
		Proprietario p2 = new Proprietario("Joao", "6465467546", "56765865685","25/08/1995","rua dos ipes","caucaia","cotia","sp","05242-807","ap352");
		System.out.println(p2);
        JOptionPane.showMessageDialog (null, p2);
	}
}
