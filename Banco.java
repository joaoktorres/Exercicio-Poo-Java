package main;

public class Banco {

	String nome;
	int nrconta;
	float saldo = 100;
	
	public void Saque(float saque) {
		this.saldo -= saque;
	}
	
	public void deposito(float deposito) {
		this.saldo += deposito;
	}
	
	public float ConsultaSaldo() {
		return this.saldo;
	}
	
	public String ConsultaNome() {
		return this.nome;
	}
	
	public void AlterarNome(String name) {
		this.nome = name;
	}
}
