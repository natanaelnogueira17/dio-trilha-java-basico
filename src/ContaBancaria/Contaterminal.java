package ContaBancaria;

import java.util.Scanner;

public class Contaterminal {
	
	int numero;
	String agencia;
	String nomeCliente;
	double saldo = 50.0;
	
	
	
	public static void main(String[] args) {
		Contaterminal contaBanco = new Contaterminal();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência");
		contaBanco.agencia = sc.next();
		System.out.println("Por favor, digite o número de sua Conta");
		contaBanco.numero = sc.nextInt();
		System.out.println("Por favor, digite seu nome");
		contaBanco.nomeCliente = sc.next();
		
		
		System.out.println("Olá "+contaBanco.nomeCliente+", obrigado por criar "
				+ "uma conta em nosso banco, sua agência é "+contaBanco.agencia+", "
				+ "conta "+contaBanco.numero+" e seu saldo R$"+contaBanco.saldo+" já está disponível "
				+ "para saque.");

	}

}
