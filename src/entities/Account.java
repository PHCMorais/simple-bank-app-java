package entities;

/*
 * PASSOS:
 * conta bancária deve possuir,
 *  -NOME
 *  -NUMERO DA CONTA
 *  -DEPÓSITO INICIAL (opcional)
 *  
 */

public class Account {

	private int accNumber;
	private String accHolder;
	private double iniDeposit;
	private double accBalance;

	// CONSTRUTORES - POSSO INICIAR UMA CONTA COM OU SEM O DEPÓSITO INICIAL
	public Account(int accNumber, String accHolder) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
	}

	public Account(int accNumber, String accHolder, double iniDeposit) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		deposit(iniDeposit);
	}

	// GETTERS & SETTERS
	/*
	 * ACC HOLDER - GET & SET ACC NUMBER - GET ACC INI DEPOSIT - GET
	 */
	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public int getAccNumber() {
		return accNumber;
	}

	/*
	 * public void setAccNumber (int accNumber){ this.accNumber = accNumber; }
	 */
	public double getAccBalance() {
		return iniDeposit;
	}
	

	//FUNÇÕES
	
	//Função de depósito
	public void deposit(double ammount) {
		this.accBalance += ammount;
	}
	
	//Função de saque (+5 dolares de taxa)
	public void withdraw(double ammount) {
		this.accBalance -= ammount + 5;
	}
	
	
	//função para poder imprimir os dados da conta em formato string
	public String toString() {
		return  "Account "
				+ accNumber
				+ ", Holder: "
				+ accHolder
				+ ", Balance: "
				+ String.format("%.2f", accBalance);
	}
}
