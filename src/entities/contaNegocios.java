
package entities;

public class contaNegocios extends conta {

	private Double emprestimoLimite;
	
	public contaNegocios() {
		super();
	}

	public contaNegocios(Integer number, String titular, Double saldo, Double emprestimoLimite) {
		super(number, titular, saldo);
		this.emprestimoLimite = emprestimoLimite;
	}

	public Double getemprestimoLimite() {
		return emprestimoLimite;
	}

	public void setemprestimoLimite(Double emprestimoLimite) {
		this.emprestimoLimite = emprestimoLimite;
	}
	
	public void emprestimo(double valor) {
		if (valor <= emprestimoLimite) {
			saldo += valor - 10.0;
		}		
	}	
	
	
	@Override
	public void saque(double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}
	
}
