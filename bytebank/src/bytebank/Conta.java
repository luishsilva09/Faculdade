package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Titular titular;
	
	public void dipositar(int value){
		this.saldo += value;
		System.out.println(saldo);
	}
	public boolean sacar(int value) {
		if (this.saldo >= value) {
			this.saldo -= value;
			return true;
		}else {
			return false;
		}
		
	}
	public boolean transfer(int value, Conta destino) {
		if (this.saldo >= value) {
			this.sacar(value);
			destino.dipositar(value);
			return true;
		}
		return false;
	}
}
 