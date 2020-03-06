package entities;

public class conta {

	private Integer number;
	private String titular;
	protected Double saldo;
		
	public conta() {
	}
	
	public conta(Integer number, String titular, Double saldo) {
		this.number = number;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String gettitular() {
		return titular;
	}

	public void settitular(String titular) {
		this.titular = titular;
	}

	public Double getsaldo() {
		return saldo;
	}

	public void saque(double valor) {
		saldo -= valor + 5.0;
	}

	public void deposito(double valor) {
		saldo += valor;
	}
}
