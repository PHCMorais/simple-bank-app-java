package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		/*
		 * em um banco, para se cadastrar uma conta bancária é necessário informar o número da conta, e o valor de depósito inicial que o  titular depositou ao abrir 
		 * a conta. 
		 * 
		 * Este valor de depósito inicial, entretanto, é opcional, ou seja:
		 * se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo da conta será, naturalmente, ZERO
		 * 
		 * IMPORTANTE: uma vez que a conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa
		 * pode mudar de nome, por ocasião de casamento, por exemplo)
		 * 
		 * Por fim, o saldo da conta não pode ser alterado livermenete. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques.
		 * Para cada saque realizado, o banco cobra uma taxa de $5.00.
		 *  
		 * NOTA: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o o saque e/ou pagar a taxa.
		 * 
		 * 
		 * Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou ão informado o valor de depósito inicial. em seguida, realizar um depósito
		 * e depois um saque, sempre mostrando os dados da conta após cada operação
		 *
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		//criação de variaveis auxiliares para instanciar o objeto
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		sc.nextLine(); //necessário para o nextline não pegar o ENTER!
		System.out.print("Enter account holder: ");
		String accHolder = sc.nextLine();
		
		System.out.println("Is there a initial deposit (y/n)");
		char resp = sc.next().charAt(0);
		
		
		Account account;
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: $");
			double iniDeposit = sc.nextDouble();
			 account = new Account(accNumber, accHolder, iniDeposit );
		}else {
			 account = new Account(accNumber, accHolder);
		}
		
		//imprimi os dados da conta iniciais
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);
		System.out.println();
		
		//fazendo o depósito
		System.out.print("Enter deposit value: $");
		double ammount = sc.nextDouble();
		account.deposit(ammount);
		System.out.println("Updated account Data: ");
		System.out.println(account);
		System.out.println();
		
		//fazendo um saque
		System.out.print("Enter withdraw value: $");
		ammount = sc.nextDouble();
		account.withdraw(ammount);
		System.out.println("Updated account Data: ");
		System.out.println(account);
		
		
		sc.close();
		
	}

}
