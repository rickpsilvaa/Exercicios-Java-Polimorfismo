package ex7;

import java.util.Scanner;

public class Funcionario {

	private String nome;
	
	
	public Funcionario() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

public String getNome() {
		return nome;
	}

	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public String getDados() {
		String s = super.getDados() +
				"recebe o salario de R$ "
				+ getPagamento(sal);
		return s;
	}
	
	public void mostrarPagamento() {
		System.out.println("O pagamento �: ");
	}
	
	
	
	public void inserirDados() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do funcionario: ");
		String n = sc.next();
		
		
		setNome(n);
		
	}
}
