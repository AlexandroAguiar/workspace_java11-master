
public class ContaBancaria {
	int    numeroConta;
	String nomeTitular;
	String cpfTitular;
	double saldo;
	
	void depositar(double valor) {
		saldo = saldo + valor;
		// ou seja, somo ao saldo o valor passado como parâmetro
	}
	
	boolean sacar(double valor) {
		if (saldo >= valor) {  // tenho saldo suficiente
			saldo = saldo - valor;
			return true;   // indicando que o saque foi autorizado
		}
		else {
			return false;  // retornar false indica que o saque não foi autorizado
		}
	}
	
	String mostrarInfo() {
		String infoConta;
		infoConta = "Conta "+numeroConta+" / "+nomeTitular+" ("+cpfTitular+")  R$  "+saldo;
		return infoConta;
	}
}
