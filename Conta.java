package main;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		
		boolean sai = false;
		int opcao = 0;
		
		Banco banco = new Banco();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nome = sc.nextLine();
		banco.AlterarNome(nome);
		
		do {
			System.out.println("Escolha uma opção do menu:");
			System.out.println("1 - Sacar; 2 - Depositar; 3 - Consultar Saldo; 4 - Sair");
			opcao = sc.nextInt();
			
			System.out.println("Você tem R$" + banco.ConsultaSaldo() + " disponível no banco.");
			
		switch (opcao) {
		case 1:
			System.out.println("Informe o valor do saque:");
			float saque = sc.nextFloat();
			banco.Saque(saque);
			System.out.println("Seu saldo atual é R$" + banco.ConsultaSaldo());
		break;
			
		case 2:
			System.out.println("Informe o valor do deposito:");
			float deposito = sc.nextFloat();
			banco.deposito(deposito);
			System.out.println("Seu saldo atual é R$" + banco.ConsultaSaldo());
		break;
			
		case 3:
			banco.ConsultaSaldo();
		break;
			
		case 4:
			sai = true;
			System.out.println("Volte sempre :)");			
		}
		} while (!sai);
		sc.close();
	}
}
