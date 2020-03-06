package entities;


public class contaPoupanca extends conta {
	
	private Double taxaJuro; 
	
	public contaPoupanca() {
		super();
	}

	public contaPoupanca(Integer number, String titular, Double saldo, Double taxaJuro) {
		super(number, titular, saldo);
		this.taxaJuro = taxaJuro;
	}

	public Double gettaxaJuro() {
		return taxaJuro;
	}

	public void settaxaJuro(Double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
	public void updateSaldo() {
		saldo += saldo * taxaJuro;
	}
	
	@Override
	public void saque(double valor) {
		saldo -= valor;
	}
	
}

