package Variveis;

public class testeIr {
	public static void main(String[] args) {
		double salario = 2700.50;
		
		if(salario >= 1900.0 && salario <=2800.0) {
			System.out.println("IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		}else {
			if(salario > 2800.0 && salario  <= 3751.0) {
				System.out.println("IR é de 15% e pode deduzir R$ 350");
			}
		}
	}

}
