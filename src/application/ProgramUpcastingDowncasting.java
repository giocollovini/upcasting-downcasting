
package application;

import entities.conta;
import entities.contaNegocios;
import entities.contaPoupanca;

public class ProgramUpcastingDowncasting {

	public static void main(String[] args) {

		conta acc = new conta(1001, "Alex", 0.0);
		contaNegocios bacc = new contaNegocios(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING		
		conta acc1 = bacc;
		conta acc2 = new contaNegocios(1003, "Bob", 0.0, 200.0);
		conta acc3 = new contaPoupanca(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING	
		contaNegocios acc4 = (contaNegocios)acc2;
		acc4.emprestimo(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof contaNegocios) {
			contaNegocios acc5 = (contaNegocios)acc3;
			acc5.emprestimo(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof contaPoupanca) {
			contaPoupanca acc5 = (contaPoupanca)acc3;
			acc5.updateSaldo();
			System.out.println("Update!");
		}
	}
}